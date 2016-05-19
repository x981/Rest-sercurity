package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import model.HocsinhModel;
import entities.Hocsinh;
import entities.HocsinhWs;

@Path(value = "sunshine")
public class SunshineRestFul {
	
	@GET
	@Path(value = "tim/{tenhs}")
	@Produces(MediaType.APPLICATION_XML)
	public List<HocsinhWs> timhsXML(@PathParam(value = "tenhs") String tenhs){
		List<HocsinhWs> dshs = new ArrayList<HocsinhWs>();
		HocsinhModel hsm = new HocsinhModel();
		for (Hocsinh hs: hsm.findten(tenhs)){
			HocsinhWs hsw = new HocsinhWs();
			hsw.setMahs(hs.getMaHs());
			hsw.setHoten(hs.getHoten());
			hsw.setTen(hs.getTen());
			hsw.setNgaysinh(hs.getNamsinh());
			if (hs.getLophoc()!=null){
				hsw.setLop(hs.getLophoc().toString());
			} else {
				hsw.setLop("Chua xep lop");
			}
			hsw.setTrangthai(hs.getTrangthai());
			dshs.add(hsw);
		}
		return dshs;
	}
	
	@GET
	@Path(value = "timjs/{tenhs}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HocsinhWs> timhsJSON(@PathParam(value = "tenhs") String tenhs){
		List<HocsinhWs> dshs = new ArrayList<HocsinhWs>();
		HocsinhModel hsm = new HocsinhModel();
		for (Hocsinh hs: hsm.findten(tenhs)){
			HocsinhWs hsw = new HocsinhWs();
			hsw.setMahs(hs.getMaHs());
			hsw.setHoten(hs.getHoten());
			hsw.setTen(hs.getTen());
			hsw.setNgaysinh(hs.getNamsinh());
			if (hs.getLophoc()!=null){
				hsw.setLop(hs.getLophoc().toString());
			} else {
				hsw.setLop("Chua xep lop");
			}
			hsw.setTrangthai(hs.getTrangthai());
			dshs.add(hsw);
		}
		return dshs;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(value = "timma/{mahs}")
	public HocsinhWs timma(@PathParam(value = "mahs") String mahs){
		System.out.println("tim ma");
		
		HocsinhModel hsm = new HocsinhModel();
		Hocsinh hs = hsm.find(Integer.parseInt(mahs));
		HocsinhWs hsw = new HocsinhWs();
		hsw.setMahs(hs.getMaHs());
		hsw.setHoten(hs.getHoten());
		hsw.setTen(hs.getTen());
		hsw.setNgaysinh(hs.getNamsinh());
		if (hs.getLophoc()!=null){
			hsw.setLop(hs.getLophoc().toString());
		} else {
			hsw.setLop("Chua xep lop");
		}
		hsw.setTrangthai(hs.getTrangthai());
		return hsw;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path(value = "capnhat")
	public HocsinhWs update(@FormParam("mahs") int mahs, @FormParam("hoten") String hoten, @FormParam("ten") String ten){
		HocsinhModel hsm = new HocsinhModel();
		Hocsinh hs = hsm.find(mahs);
		hs.setHoten(hoten);
		hs.setTen(ten);
		hsm.update(hs);
		HocsinhWs hsw = new HocsinhWs();
		hsw.setMahs(hs.getMaHs());
		hsw.setHoten(hs.getHoten());
		hsw.setTen(hs.getTen());
		hsw.setNgaysinh(hs.getNamsinh());
		hsw.setLop(hs.getLophoc().toString());
		hsw.setTrangthai(hs.getTrangthai());
		return hsw;
	}
	
	@PUT
	@Path(value = "taomoi")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public HocsinhWs create(HocsinhWs hw){
		HocsinhModel hsm = new HocsinhModel();
		Hocsinh hs = new Hocsinh();
		hs.setHoten(hw.getHoten());
		hs.setTen(hw.getTen());
		hsm.create(hs);
		HocsinhWs hw1 = new HocsinhWs();
		hw1.setMahs(hs.getMaHs());
		hw1.setHoten(hs.getHoten());
		hw1.setTen(hs.getTen());
		return hw1;
	}

}
