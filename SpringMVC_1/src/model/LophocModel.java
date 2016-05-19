package model;

import java.util.ArrayList;
import java.util.List;

import entities.Lophoc;

public class LophocModel {
	
	public List<Lophoc> findAll(){
		List<Lophoc> dslop = new ArrayList<Lophoc>();
		dslop.add(new Lophoc(1, "Lop 1"));
		dslop.add(new Lophoc(2, "Lop 2"));
		dslop.add(new Lophoc(3, "Lop 3"));
		dslop.add(new Lophoc(4, "Lop 4"));
		dslop.add(new Lophoc(5, "Lop 5"));
		return dslop;
	}
	
	public Lophoc find(int malop){
		LophocModel lhm = new LophocModel();
		for (Lophoc lh: lhm.findAll()){
			if (lh.getMalop() == malop){
				return lh;
			}
		}
		return null;
	}

}
