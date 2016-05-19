package controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import model.LophocModel;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import validation.SinhvienValidator;
import convertion.DateConvert;
import convertion.LophocConvert;
import entities.Lophoc;
import entities.Sinhvien;

@Controller
@RequestMapping(value = "sinhvien")
public class DangkyController {
	
	@InitBinder
	public void initBinder(WebDataBinder wb){
		wb.registerCustomEditor(Date.class, new DateConvert());
		wb.registerCustomEditor(Lophoc.class, new LophocConvert());
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String form(ModelMap mm){
		Sinhvien sv = new Sinhvien();
		sv.setGioitinh("nam");
		
		List<String> st = new ArrayList<String>();
		st.add("Bong da");
		st.add("Cau long");
		st.add("Bong ban");
		st.add("Boi loi");
		st.add("Bong chuyen");
		mm.put("st", st);
		
		List<String> fw = new ArrayList<String>();
		fw.add("SpringMVC");
		fw.add("Struts");
		fw.add("LifeRay");
		fw.add("JSP");
		fw.add("JSF");
		mm.put("fw", fw);
		
		LophocModel lhm = new LophocModel();
		List<Lophoc> dslop = new ArrayList<Lophoc>();
		dslop = lhm.findAll();
		mm.put("dslop", dslop);
		
		mm.put("sv", sv);
		return "registerform";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String xulydangky(@ModelAttribute(value = "sv") @Valid Sinhvien sv, BindingResult br, ModelMap mm){
		SinhvienValidator svv =  new SinhvienValidator();
		svv.validate(sv, br);
		if (br.hasErrors()){
			List<String> st = new ArrayList<String>();
			st.add("Bong da");
			st.add("Cau long");
			st.add("Bong ban");
			st.add("Boi loi");
			st.add("Bong chuyen");
			mm.put("st", st);
			
			List<String> fw = new ArrayList<String>();
			fw.add("SpringMVC");
			fw.add("Struts");
			fw.add("LifeRay");
			fw.add("JSP");
			fw.add("JSF");
			mm.put("fw", fw);
			
			LophocModel lhm = new LophocModel();
			List<Lophoc> dslop = new ArrayList<Lophoc>();
			dslop = lhm.findAll();
			mm.put("dslop", dslop);
			return "registerform";
		} else {
			mm.put("sv", sv);
			return "thongtintaikhoan";
		}
	}

}
