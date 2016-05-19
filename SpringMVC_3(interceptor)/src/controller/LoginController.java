package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entities.Taikhoan;

@Controller
@RequestMapping(value = "account")
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Model m){
		m.addAttribute("tk", new Taikhoan());
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String xulylogin(@ModelAttribute(value = "tk")Taikhoan tk, HttpServletRequest request, ModelMap mm){
		if (tk.getTen().equalsIgnoreCase("abc")) {
			request.getSession().setAttribute("tentk", tk.getTen());
			return "wellcome";	
		} else {
			mm.put("mess", "Ten dang nhap hoac mat khau khong dung.");
			return "login";
		}
		
	}
	
	@RequestMapping(value = "wellcome", method = RequestMethod.GET)
	public String wellcome(){
		return "wellcome";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String xulylogin(HttpSession session, Model m){
		session.removeAttribute("tentk");
		m.addAttribute("tk", new Taikhoan());
		return "login";
	}
}
