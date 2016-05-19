package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import javax.websocket.server.PathParam;

import model.DoituongModel;
import model.HocsinhModel;
import model.LophocModel;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entities.Hocsinh;
import entities.Lophoc;
import entities.Number;

@Controller
@RequestMapping(value = "/")
public class HocsinhController {

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value = "timhs", method = RequestMethod.POST)
	public String timhs(@RequestParam(value = "tenhs")String tenhs, @RequestParam(value = "sdtb")String sdtb, @RequestParam(value = "sdtm")String sdtm, ModelMap mm){
		HocsinhModel hsm = new HocsinhModel();
		System.out.println(tenhs + "," + sdtb + ", " + sdtm);
		if (tenhs.trim().length()>0) {
			System.out.println("tim theo ten: " + hsm.findten(tenhs).size());
			List<Hocsinh> dshs = new ArrayList<Hocsinh>(hsm.findten(tenhs));
			mm.put("dshs", dshs);
		} else if (sdtb.trim().length()>0) {
			System.out.println("tim theo sdtb");
			mm.put("dshs", hsm.timtheoSDTB(sdtb));
		} else if(sdtm.trim().length()>0){
			System.out.println("tim theo sdtm");
			mm.put("dshs", hsm.timtheoSDTM(sdtm));
		}
		return "home";
	}
	
	@RequestMapping(value = "danhsachlop/{malop}", method = RequestMethod.GET)
	@ResponseBody
	public List<Hocsinh> xulytimhs(@PathVariable(value = "malop")String malop){
		LophocModel lhm = new LophocModel();
		Lophoc lh = lhm.find(Integer.parseInt(malop));
		List<Hocsinh> ds = new ArrayList<Hocsinh>(lh.getHocsinhs());
		return ds;
	}
	
	@RequestMapping(value = "addhs", method = RequestMethod.GET)
	public String addhs(ModelMap mm){
		LophocModel lhm = new LophocModel();
		DoituongModel dtm =new DoituongModel();
		Hocsinh hs = new Hocsinh();
		hs.setGioitinh("Nam");
		mm.addAttribute("hs", hs);
		mm.put("dslop", lhm.Lopconhan("ang"));
		mm.put("dsdoituong", dtm.findAll());
		return "addHs";
	}
	
	@RequestMapping(value = "danhsachlop", method = RequestMethod.GET)
	public String dslop(ModelMap mm){
		LophocModel lhm = new LophocModel();
		mm.put("dslop", lhm.Lopconhan("ang"));
		return "danhsachlop";
	}
	
	@RequestMapping(value = "chitietlop", method = RequestMethod.POST)
	public String chitietlop(@PathParam(value = "cblop")int cblop, ModelMap mm){
		System.out.println(cblop);
		LophocModel lhm = new LophocModel();
		Lophoc lh = lhm.find(cblop);
		mm.put("dshs", lh.getHocsinhs());
		mm.put("dslop", lhm.Lopconhan("ang"));
		return "danhsachlop";
	}
	
}
