package entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hocsinh")
public class HocsinhWs {
	
	private int mahs;
	private String hoten;
	private String ten;
	private Date ngaysinh;
	private String lop;
	private String trangthai;
	
	@XmlElement
	public int getMahs() {
		return mahs;
	}
	public void setMahs(int mahs) {
		this.mahs = mahs;
	}
	
	@XmlElement
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	@XmlElement
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	@XmlElement
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
	@XmlElement
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	@XmlElement
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public HocsinhWs(int mahs, String hoten, String ten, Date ngaysinh,
			String lop, String trangthai) {
		super();
		this.mahs = mahs;
		this.hoten = hoten;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.lop = lop;
		this.trangthai = trangthai;
	}
	public HocsinhWs() {
		super();
		// TODO Auto-generated constructor stub
	}
}
