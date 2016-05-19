package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "searchControl")
public class SearchController {

	@RequestMapping(value = "timkiem", method = RequestMethod.GET)
	public String timkiem(){
		return "search";
	}
	
	@RequestMapping(value = "timkiem", method = RequestMethod.POST)
	public String xulytimkiem(HttpServletRequest request, ModelMap mm){
		mm.put("str", "Em chao anh " + request.getParameter("str"));
		return "result";
	}

}
