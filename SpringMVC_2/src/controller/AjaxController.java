package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.SanphamModel;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entities.Sanpham;

@Controller
@RequestMapping(value = "ajax")
public class AjaxController {
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(){
		return "search";
	}
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(){
		return "Hello Ajax";
	}
	
	@RequestMapping(value = "helloname/{s}", method = RequestMethod.GET)
	@ResponseBody
	public String helloname(@PathVariable(value = "s") String s){
		return "Hello " + s;
	}
	
	@RequestMapping(value = "laydssp", method = RequestMethod.GET)
	@ResponseBody
	public List<Sanpham> laydssp(){
		SanphamModel spm = new SanphamModel();
		return spm.findAll();
	}
	
	@RequestMapping(value = "laysp/{masp}", method = RequestMethod.GET)
	@ResponseBody
	public Sanpham laysp(@PathVariable(value = "masp")String masp){
		SanphamModel spm = new SanphamModel();
		Sanpham sp = spm.find(Integer.parseInt(masp));
		return sp;
	}
	
	@RequestMapping(value = "laytensp", method = RequestMethod.GET)
	@ResponseBody
	public List<String> laysp(HttpServletRequest request){
		SanphamModel spm = new SanphamModel();
		return spm.gettensp(request.getParameter("term"));
	}
	
	@RequestMapping(value = "taomoi", method = RequestMethod.GET)
	@ResponseBody
	public Sanpham taomoi(@RequestParam(value = "masp")String masp, @RequestParam(value = "tensp")String tensp, @RequestParam(value = "soluong")String soluong){
		Sanpham sp = new Sanpham();
		sp.setMasp(Integer.parseInt(masp));
		sp.setTensp(tensp);
		sp.setSoluong(Integer.parseInt(soluong));
		return sp;
	}
}
