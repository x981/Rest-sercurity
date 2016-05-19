package model;

import java.util.ArrayList;
import java.util.List;

import entities.Sanpham;

public class SanphamModel {
	
	public Sanpham find(int masp){
		for (Sanpham sp: this.findAll()){
			if (sp.getMasp() == masp) {
				return sp;
			}
		}
		return null;
	}
	
	public List<Sanpham> findAll(){
		List<Sanpham> dssp = new ArrayList<Sanpham>();
		dssp.add(new Sanpham(1, "Nokia", 4));
		dssp.add(new Sanpham(2, "Sansung", 4));
		dssp.add(new Sanpham(3, "HTC", 4));
		dssp.add(new Sanpham(4, "Apple", 4));
		dssp.add(new Sanpham(5, "Oppo", 4));
		dssp.add(new Sanpham(6, "BPhone", 4));
		dssp.add(new Sanpham(7, "LG", 4));
		return dssp;
	}
	
	public List<String> gettensp(String ten){
		List<String> dsten = new ArrayList<String>();
		for (Sanpham sp: this.findAll()){
			if (sp.getTensp().toLowerCase().startsWith(ten)) {
				dsten.add(sp.getTensp());	
			}
		}
		return dsten;
	}

}
