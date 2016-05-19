package controller;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.core.*;

import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import entities.Nguoichoi;


@Controller
@RequestMapping(value = "/")
public class HocvuiController {
	
	private WebResource webresource;
	private Client client;
	private final String basePath = "http://localhost:8080/HocvuiWebservices/rest";

	public HocvuiController() {
		client = Client.create(new DefaultClientConfig());
		webresource = client.resource(basePath).path("user");
	}
	
	public Nguoichoi wslogin(MultivaluedMapImpl formData){
		WebResource wr = webresource.path("login");
		wr.accept(MediaType.APPLICATION_JSON);
		ClientResponse res = wr.type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, formData);
		if (res.getStatus() == 204) {
			return null;
		} else {
			return res.getEntity(Nguoichoi.class);	
		}
		
	}
	
	public String hello(){
		WebResource wr = webresource.path("hello");
		return wr.accept(MediaType.TEXT_HTML).get(String.class);
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String xulylogin(@PathParam(value = "email") String email, @PathParam(value = "pass") String pass, HttpServletRequest request){
		MultivaluedMapImpl mi = new MultivaluedMapImpl();
		mi.add("email", email);
		mi.add("pass", pass);
		Nguoichoi ncc = wslogin(mi);
		if (ncc == null){
			return "failed";
		} else 
			request.getSession().setAttribute("user", ncc);
			return "success";
	}
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String chao(ModelMap mm){
		String s = hello();
		mm.put("mess", s);
		return "info";
	}
	
}
