package main;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import entities.HocsinhWs;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client;
		WebResource ws;
		String Base_Path = "http://localhost:8080/RestFulWS/rest/sunshine/";
		client = Client.create();
		ws = client.resource(Base_Path);
		
		javax.ws.rs.core.Form f = new javax.ws.rs.core.Form();
		f.param("mahs", "4");
		f.param("hoten", "Lương Huyền Mai");
		f.param("ten", "Anh");
		
		WebResource wr = ws.path("/capnhat");
		wr.accept(MediaType.APPLICATION_XML);
		ClientResponse response = wr.type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, f);
		HocsinhWs hs = response.getEntity(HocsinhWs.class);
		
		System.out.println(hs.getHoten());
	}

}
