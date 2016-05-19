package ws;

import java.util.ArrayList;
import java.util.List;

import model.HocsinhModel;
import entities.Hocsinh;
import entities.HocsinhWs;

public class TimkiemWs {
	
	public List<HocsinhWs> search(String tenhs){
		HocsinhModel hsm = new HocsinhModel();
		List<HocsinhWs> dshs = new ArrayList<HocsinhWs>();
		for (Hocsinh hs: hsm.findten(tenhs)){
			HocsinhWs hsw = new HocsinhWs();
			hsw.setMaHs(hs.getMaHs());
			hsw.setHoten(hs.getHoten());
			hsw.setTen(hs.getTen());
			hsw.setGioitinh(hs.getGioitinh());
			hsw.setNgaysinh(hs.getNamsinh());
			if (hs.getLophoc()!=null) {
				hsw.setLop(hs.getLophoc().toString());	
			} else {
				hsw.setLop("Chua xep lop");
			}
			dshs.add(hsw);
		}
		return dshs;
	}

}
