package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import entities.Giaovien;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		if (!request.getRequestURI().contains("index.html")) {
			if (!request.getRequestURI().contains("login.html")) {
				Giaovien gv = (Giaovien) request.getSession()
						.getAttribute("gv");
				if (gv == null) {
					response.sendRedirect("/SpringMVC_Hibernate2/index.html");
					return false;
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}

	}

}
