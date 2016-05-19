package controller;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "hello")
public class HelloController {
	
	@RequestMapping(value = "xinchao", method = RequestMethod.GET)
	public String hello(ModelMap mm){
		mm.put("result", "Chao anh Quan");
		return "index";
	}
	
	@RequestMapping(value = "chao/{s}", method = RequestMethod.GET)
	public String chao(@PathVariable(value = "s")String s, ModelMap mm){
		mm.put("str", "Hello anh " + s);
		return "view";
	}
	
	@RequestMapping(value = "tong/{a}/{b}", method = RequestMethod.GET)
	public String tong(@PathVariable(value = "a")int a, @PathVariable(value = "b")int b, ModelMap mm){
		mm.put("kq", a + b);
		return "view";
	}
}
