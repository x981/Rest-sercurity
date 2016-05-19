package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
		@Override
		public boolean preHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler) throws Exception {
			// TODO Auto-generated method stub
			if (!request.getRequestURI().contains("login.html")) {
				String tentk = (String) request.getSession().getAttribute("tentk");
				if (tentk!=null) {
					return true;
				} else {
					response.sendRedirect("/SpringMVC_3_interceptor/account/login.html");
					return false;
				}
			} else {
				return true;
			}
			
		}
		
		@Override
		public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
		}
		
		@Override
		public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
		}
}
