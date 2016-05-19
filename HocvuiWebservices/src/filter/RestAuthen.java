package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.Filter.Chain;

public class RestAuthen implements Filter {
	
	public static final String AUTHENTICATION_HEADER = "Authorization";

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)arg0;
		String header = request.getHeader(AUTHENTICATION_HEADER);
		System.out.println(header);
		AuthenSvr as = new AuthenSvr();
		
		boolean result = as.authenservice(header);
		
		if (result) {
			arg2.doFilter(arg0, arg1);	
		} else {
			HttpServletResponse response = (HttpServletResponse)arg1;
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Khoi tao filter");
		
	}
}
