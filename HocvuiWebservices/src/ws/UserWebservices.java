package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

import entities.Nguoichoi;
import model.UserModel;

@Path(value = "user")
public class UserWebservices {
	
	@GET
	@Path(value = "checkxml/{email}/{password}")
	@Produces(MediaType.APPLICATION_XML)
	public Nguoichoi checkXML(@PathParam(value = "email") String email,@PathParam(value = "password") String password){
		System.out.println("Den day roi");
		UserModel um = new UserModel();
		Nguoichoi nc = um.find(email, password);
		if (nc!=null)
			System.out.println("Thay");
		return nc;
	}
	
	@GET
	@Path(value = "check/{email}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Nguoichoi check(@PathParam(value = "email")String email,@PathParam(value = "password")String password){
		UserModel um = new UserModel();
		Nguoichoi nc = um.find(email, password);
		return nc;
	}
	
	@GET
	@Path(value = "hello")
	@Produces(MediaType.TEXT_HTML)
	public String hello(){
		return "hello";
	}
	
	@POST
	@Path(value = "login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Nguoichoi login(@FormParam("email")String email, @FormParam("pass") String pass){
		System.out.println("Den ws roi, vui qua");
		System.out.println(email + "/" + pass);
		UserModel um = new UserModel();
		Nguoichoi nc = um.find(email.trim(), pass.trim());
		System.out.println(nc);
		if (nc != null){
			return nc;
		} else { 
			return null;
		}
	}
}
