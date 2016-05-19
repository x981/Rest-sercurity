package controller;

import model.SanphamModel;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "sanpham")
public class SanphamController {

	@RequestMapping(value = "danhsachsanpham", method = RequestMethod.GET)
	public String danhsachsanpham(Model m){
		SanphamModel spm = new SanphamModel();
		m.addAttribute("dssp", spm.findAll());
		return "danhsachsanpham";
	}
}
