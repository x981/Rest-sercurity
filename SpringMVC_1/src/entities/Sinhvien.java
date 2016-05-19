package entities;

import java.util.*;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import validation.Phone;

import com.sun.istack.internal.NotNull;

public class Sinhvien {
	
	@NotEmpty
	@Length(min = 6, max = 10)
	private String hoten;
	@NotEmpty
	@Length(min = 5)
	private String ten;
	private Date ngaysinh;
	private String gioitinh;
	private List<String> sothich;
	private List<String> framework;
	private Lophoc lophoc;
	@NotEmpty @Phone
	private String sdt;
	private String diachi;
	
	
	
	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
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
	
	public Date getNgaysinh() {
		return ngaysinh;
	}
	
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
	public String getGioitinh() {
		return gioitinh;
	}
	
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	
	public List<String> getSothich() {
		return sothich;
	}
	
	public void setSothich(List<String> sothich) {
		this.sothich = sothich;
	}
	
	public List<String> getFramework() {
		return framework;
	}
	
	public void setFramework(List<String> framework) {
		this.framework = framework;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Lophoc getLophoc() {
		return lophoc;
	}

	public void setLophoc(Lophoc lophoc) {
		this.lophoc = lophoc;
	}

	public Sinhvien(String hoten, String ten, Date ngaysinh, String gioitinh,
			List<String> sothich, List<String> framework, Lophoc lophoc,
			String sdt, String diachi) {
		super();
		this.hoten = hoten;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.sothich = sothich;
		this.framework = framework;
		this.lophoc = lophoc;
		this.sdt = sdt;
		this.diachi = diachi;
	}

	public Sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}
}
