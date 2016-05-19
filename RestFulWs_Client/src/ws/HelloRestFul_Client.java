package ws;

import java.text.MessageFormat;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class HelloRestFul_Client {

	private Client client;
	private WebResource ws;
	private String Base_Path = "http://localhost:8080/RestFulWS/rest/hello/";

	public HelloRestFul_Client() {
		// TODO Auto-generated constructor stub
		client = Client.create();
		ws = client.resource(Base_Path);
	}

	public String text() {
		WebResource wr = ws.path("text");
		wr.accept(MediaType.TEXT_PLAIN);
		return wr.get(String.class);
	}

	public String html() {
		WebResource wr = ws.path("html");
		wr.accept(MediaType.TEXT_HTML);
		return wr.get(String.class);
	}

	public String chao(String ten) {
		WebResource wr = ws.path(MessageFormat.format("chao/{0}", new Object[] {ten}));
		wr.accept(MediaType.TEXT_PLAIN);
		return wr.get(String.class);
	}

	public String tong2so(int a, int b) {
		WebResource wr = ws.path(MessageFormat.format("tong/{0}/{1}", new Object[] {a, b}));
		wr.accept(MediaType.TEXT_HTML);
		return "Tong 2 so la : " +  wr.get(String.class);
	}
}
