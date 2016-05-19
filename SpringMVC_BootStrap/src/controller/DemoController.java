package controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class DemoController {
	
	@RequestMapping(value = "index")
	public String index(){
		return "test1";
	}

}
