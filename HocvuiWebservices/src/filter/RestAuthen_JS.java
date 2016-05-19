package filter;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;


public class RestAuthen_JS implements ContainerRequestFilter{

	public static final String AUTHENTICATION_HEADER = "Authorization";

	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Da vao den day");
		String containerrequest = arg0.getHeaderString(AUTHENTICATION_HEADER);
		
		AuthenSvr as = new AuthenSvr();
		boolean result = as.authenservice(containerrequest);
		if (!result){
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}
		
	}
	
}
