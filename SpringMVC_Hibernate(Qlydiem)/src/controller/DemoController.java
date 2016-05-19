package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.LophocModel;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entities.Lophoc;
import entities.Sinhvien;

@Controller
@RequestMapping(value = "/")
public class DemoController {
	
	@RequestMapping(value = ("danhsachlop"), method = RequestMethod.GET)
	public String danhsachlop(ModelMap mm){
		LophocModel lhm = new LophocModel();
		List<Lophoc> dslop = new ArrayList<Lophoc>(lhm.findAll());
		mm.put("dslop", dslop);
		return "danhsachlop";
	}
	
	@RequestMapping(value = "danhsachlop/{malop}", method = RequestMethod.GET)
	@ResponseBody
	public List<Sinhvien> hiendslop(@PathVariable(value = "malop")String malop){
		LophocModel lhm = new LophocModel();
		Lophoc lh = lhm.find(Integer.parseInt(malop));
		List<Sinhvien> dssv = new ArrayList<Sinhvien>(lh.getSinhviens());
		return dssv;
	}
}
