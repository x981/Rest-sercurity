package com.quan.rest;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletContext;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ResourceMethodInvoker;

import org.jboss.resteasy.core.interception.PostMatchContainerRequestContext;

import org.jboss.resteasy.spi.metadata.ResourceMethod;

//import com.sun.jersey.spi.container.ContainerRequest;
//import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.research.ws.wadl.Method;

@Provider
@ServerInterceptor
public class SercurityInterceptor implements
		javax.ws.rs.container.ContainerRequestFilter {

	@Context
	private ResourceInfo resourceInfo;
	private static final String AUTHORIZATION_PROPERTY = "Authorization";

	public void filter(ContainerRequestContext arg0) throws IOException {
		// TODO Auto-generated method stub
		
		java.lang.reflect.Method method = resourceInfo.getResourceMethod();
		
		if (method.isAnnotationPresent(DenyAll.class)) {
			throw new WebApplicationException(Status.FORBIDDEN);
		}

		if (method.isAnnotationPresent(RolesAllowed.class)) {
			String authenstring = arg0.getHeaderString(AUTHORIZATION_PROPERTY);
			
			AuthenSvr au = new AuthenSvr();
			boolean result = au.authenservice(authenstring);

			if (result) {
				String quyen = "ADMIN";

				RolesAllowed ra = method.getAnnotation(RolesAllowed.class);
				Set<String> roleset = new HashSet<String>(Arrays.asList(ra
						.value()));
				if (!roleset.contains(quyen)) {
					throw new WebApplicationException(Status.NOT_ACCEPTABLE);
				}
			} else {
				throw new WebApplicationException(Status.UNAUTHORIZED);
			}
		}
	}
}
