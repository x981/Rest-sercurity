package ws;

import java.text.MessageFormat;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.*;

import org.omg.PortableInterceptor.ClientRequestInterceptorOperations;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import entities.HocsinhWs;

public class SunshineRestFul_client {
	
	private Client client;
	private WebResource ws;
	private String Base_Path = "http://localhost:8080/RestFulWS/rest/sunshine/";
	
	public SunshineRestFul_client() {
		// TODO Auto-generated constructor stub
		
		//ClientConfig config = new DefaultClientConfig();
	    //Client client = Client.create(config);  
		client = Client.create();
		ws = client.resource(Base_Path);
	}
	
	public List<HocsinhWs> findXML(String tenhs){
		WebResource wr = ws.path(MessageFormat.format("tim/{0}", new Object[] {tenhs}));
		wr.accept(MediaType.APPLICATION_XML);
		List<HocsinhWs> dshs = wr.get(new GenericType<List<HocsinhWs>>(){});
		return dshs;
	}
	
	public List<HocsinhWs> findJSON(String tenhs){
		WebResource wr = ws.path(MessageFormat.format("timjs/{0}", new Object[] {tenhs}));
		wr.accept(MediaType.APPLICATION_JSON);
		List<HocsinhWs> dshs = wr.get(new GenericType<List<HocsinhWs>>() {});
		return dshs;
	}
	
	public HocsinhWs timma(String mahs){
		WebResource wr = ws.path(MessageFormat.format("timma/{0}", new Object[] {mahs}));
		wr.accept(MediaType.APPLICATION_JSON);
		return wr.get(HocsinhWs.class);
	}
	
	public HocsinhWs capnhat(MultivaluedMapImpl formDataInt){
		WebResource wr = ws.path("/capnhat");
		wr.accept(MediaType.APPLICATION_XML);
		ClientResponse response = wr.type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, formDataInt);
		return response.getEntity(HocsinhWs.class);
	}
	
	public HocsinhWs taomoi(HocsinhWs hw){
		WebResource wr = ws.path("taomoi");
		ClientResponse response = wr.accept(MediaType.APPLICATION_XML).put(ClientResponse.class, hw);
		return response.getEntity(HocsinhWs.class);
	}

}
