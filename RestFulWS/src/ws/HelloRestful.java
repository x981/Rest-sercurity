package ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "hello")
public class HelloRestful{
	
	@GET
	@Path(value = "text")
	@Produces(MediaType.TEXT_PLAIN)
	public String displaytext(){
		return "Hello world";
	}
	
	@GET
	@Path(value = "html")
	@Produces(MediaType.TEXT_HTML)
	public String displayhtml(){
		return "<br>Hello world<br>";
	}
	
	@GET
	@Path(value = "chao/{ten}")
	@Produces(MediaType.TEXT_PLAIN)
	public String chao(@PathParam(value = "ten") String ten){
		return "Hello " + ten;
	}	
	
	@GET
	@Path(value = "tong/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public String tong(@PathParam(value = "a") int a, @PathParam(value = "b") int b){
		return String.valueOf(a + b);
	}
}
