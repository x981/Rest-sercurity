package entities;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Nguoichoi{
	
	private int maUser;
	private String tenUser;
	private Date ngaysinh;
	private String email;
	private String tenDn;
	private String matkhau;
	private String ghichu;
	public int getMaUser() {
		return maUser;
	}
	public void setMaUser(int maUser) {
		this.maUser = maUser;
	}
	@XmlElement
	public String getTenUser() {
		return tenUser;
	}
	public void setTenUser(String tenUser) {
		this.tenUser = tenUser;
	}
	@XmlElement
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement
	public String getTenDn() {
		return tenDn;
	}
	public void setTenDn(String tenDn) {
		this.tenDn = tenDn;
	}
	@XmlElement
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	@XmlElement
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public Nguoichoi(int maUser, String tenUser, Date ngaysinh, String email,
			String tenDn, String matkhau, String ghichu) {
		super();
		this.maUser = maUser;
		this.tenUser = tenUser;
		this.ngaysinh = ngaysinh;
		this.email = email;
		this.tenDn = tenDn;
		this.matkhau = matkhau;
		this.ghichu = ghichu;
	}
	public Nguoichoi() {
		super();
		// TODO Auto-generated constructor stub
	}
}
