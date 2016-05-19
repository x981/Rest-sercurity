package entities;

import java.util.Date;

public class HocsinhWs {
	
	private int maHs;
	private String hoten;
	private String ten;
	private String gioitinh;
	private Date ngaysinh;
	private String lop;
	
	public int getMaHs() {
		return maHs;
	}
	public void setMaHs(int maHs) {
		this.maHs = maHs;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public HocsinhWs(int maHs, String hoten, String ten, String gioitinh,
			Date ngaysinh, String lop) {
		super();
		this.maHs = maHs;
		this.hoten = hoten;
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.lop = lop;
	}
	public HocsinhWs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
