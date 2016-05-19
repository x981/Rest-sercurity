package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import javax.websocket.server.PathParam;

import model.DoituongModel;
import model.GiaovienModel;
import model.HocsinhModel;
import model.LophocModel;
import model.PasswordEncryption;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entities.Giaovien;
import entities.Hocsinh;
import entities.Lophoc;
import entities.Number;

@Controller
@RequestMapping(value = "/")
public class HocsinhController {
	
	private List<Hocsinh> ds = new ArrayList<Hocsinh>();

	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@PathParam(value = "username")String username, @PathParam(value = "pass")String pass, HttpServletRequest request, ModelMap mm){
		GiaovienModel gvm = new GiaovienModel();
		String en = new PasswordEncryption().MD5(pass);
		int i = 0;
		for (Giaovien gv: gvm.findAll()){
			if (username.trim().equalsIgnoreCase(gv.getTenDn()) & en.equalsIgnoreCase(gv.getMatkhau())){
				request.getSession().setAttribute("gv", gv);
				i=1;
				break;
			}
		}
		if (i==0) {
			mm.put("mess", "Tên đăng nhập hoặc mật khẩu không đúng.");
			return "index";
		}else {
			return "home";	
		}
		
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(ModelMap mm){
		return "home";
	}
	
	@RequestMapping(value = "timhs", method = RequestMethod.POST)
	public String timhs(@RequestParam(value = "tenhs")String tenhs, @RequestParam(value = "sdtb")String sdtb, @RequestParam(value = "sdtm")String sdtm, ModelMap mm){
		int sotrang = 0;
		int tranghientai = 1;
		int sobanghi = 5;
		HocsinhModel hsm = new HocsinhModel();
		if (tenhs.trim().length()>0) {
			System.out.println(tenhs);
			System.out.println("tim theo ten: " + hsm.findten(tenhs).size());
			ds = new ArrayList<Hocsinh>(hsm.findten(tenhs));
			List<Hocsinh> dshs = new ArrayList<Hocsinh>(); 
			if (ds.size()%sobanghi==0){
				sotrang = ds.size()/sobanghi;
			} else {
				sotrang = (ds.size()/sobanghi)+1;
			}
			mm.put("sotrang", sotrang);
			mm.put("tranghientai", tranghientai);
			int start = ((tranghientai - 1) * sobanghi) + 1;
			if (ds.size()>=sobanghi) {
				for (int i=start-1; i<(start + 5)-1; i++){
					System.out.println(i);
					dshs.add(ds.get(i));
				}
			} else {
				for (int i=start-1; i<=ds.size() - 1; i++){
					System.out.println(i);
					dshs.add(ds.get(i));
				}
			}
			
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
	
	@RequestMapping(value = "timhs/{trang}", method = RequestMethod.GET)
	public String lattrang(@PathVariable(value = "trang")int trang,ModelMap mm){
		int sotrang = 0;
		int sobanghi = 5;
		List<Hocsinh> dshs = new ArrayList<Hocsinh>(); 
		if (ds.size()%sobanghi==0){
			sotrang = ds.size()/sobanghi;
		} else {
			sotrang = (ds.size()/sobanghi)+1;
		}
		mm.put("sotrang", sotrang);
		mm.put("tranghientai", trang);
		int start = ((trang - 1) * sobanghi) + 1;
		if (ds.size()>=sobanghi) {
			for (int i=start-1; i<(start + 5)-1; i++){
				System.out.println(i);
				dshs.add(ds.get(i));
			}
		} else {
			for (int i=start-1; i<=ds.size() - 1; i++){
				System.out.println(i);
				dshs.add(ds.get(i));
			}
		}
		mm.put("dshs", dshs);
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
		LophocModel lhm = new LophocModel();
		Lophoc lh = lhm.find(cblop);
		mm.put("dshs", lh.getHocsinhs());
		mm.put("dslop", lhm.Lopconhan("ang"));
		return "danhsachlop";
	}
	
	@RequestMapping(value = "chitiethocsinh/{page}/{mahs}", method = RequestMethod.GET)
	public String chitieths(@PathVariable(value = "page") int page,@PathVariable(value = "mahs")int mahs, ModelMap mm){
		HocsinhModel hsm = new HocsinhModel();
		Hocsinh hs = hsm.find(mahs);
		mm.put("hs", hs);
		mm.put("page", page);
		return "chitiethocsinh";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("gv");
		return "index";
	}
	
	
}
