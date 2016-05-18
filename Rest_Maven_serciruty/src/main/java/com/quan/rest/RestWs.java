package com.quan.rest;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

@Path(value = "ws")
public class RestWs {
	
	@PermitAll
	@GET
	@Path(value = "chao")
	@Produces(MediaType.TEXT_HTML)
	public String one(){
		return "hello";
	}
	
	@PermitAll
	@GET
	@Path(value = "chao/{ten}")
	@Produces(MediaType.TEXT_HTML)
	public String one(@PathParam(value = "ten")String ten){
		
		return "hello" + ten;
	}
	
	@DenyAll
	@GET
	@Path(value = "layso")
	@Produces(MediaType.TEXT_HTML)
	public String two(){
		return "3";
	}
	
	@RolesAllowed("ADMIN")
	@GET
	@Path(value = "laychu")
	@Produces(MediaType.TEXT_HTML)
	public String ba(){
		return "ha ha ha";
	}
}
