package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Hocphi generated by hbm2java
 */
@Entity
@Table(name = "Hocphi", catalog = "Sunshine_final")
public class Hocphi implements java.io.Serializable {

	private int maCtpt;
	private Phieuthu phieuthu;
	private Hocsinh hocsinh;
	private Lophoc lophoc;
	private int thang;
	private int nam;
	private int sotien;
	private String ghichu;

	public Hocphi() {
	}

	public Hocphi(int maCtpt, Phieuthu phieuthu, Hocsinh hocsinh,
			Lophoc lophoc, int thang, int nam, int sotien) {
		this.maCtpt = maCtpt;
		this.phieuthu = phieuthu;
		this.hocsinh = hocsinh;
		this.lophoc = lophoc;
		this.thang = thang;
		this.nam = nam;
		this.sotien = sotien;
	}

	public Hocphi(int maCtpt, Phieuthu phieuthu, Hocsinh hocsinh,
			Lophoc lophoc, int thang, int nam, int sotien, String ghichu) {
		this.maCtpt = maCtpt;
		this.phieuthu = phieuthu;
		this.hocsinh = hocsinh;
		this.lophoc = lophoc;
		this.thang = thang;
		this.nam = nam;
		this.sotien = sotien;
		this.ghichu = ghichu;
	}

	@Id
	@Column(name = "MaCTPT", unique = true, nullable = false)
	public int getMaCtpt() {
		return this.maCtpt;
	}

	public void setMaCtpt(int maCtpt) {
		this.maCtpt = maCtpt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Sophieu", nullable = false)
	public Phieuthu getPhieuthu() {
		return this.phieuthu;
	}

	public void setPhieuthu(Phieuthu phieuthu) {
		this.phieuthu = phieuthu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHS", nullable = false)
	public Hocsinh getHocsinh() {
		return this.hocsinh;
	}

	public void setHocsinh(Hocsinh hocsinh) {
		this.hocsinh = hocsinh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLop", nullable = false)
	public Lophoc getLophoc() {
		return this.lophoc;
	}

	public void setLophoc(Lophoc lophoc) {
		this.lophoc = lophoc;
	}

	@Column(name = "Thang", nullable = false)
	public int getThang() {
		return this.thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	@Column(name = "Nam", nullable = false)
	public int getNam() {
		return this.nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	@Column(name = "Sotien", nullable = false)
	public int getSotien() {
		return this.sotien;
	}

	public void setSotien(int sotien) {
		this.sotien = sotien;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}
