package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Phieuthu generated by hbm2java
 */
@Entity
@Table(name = "Phieuthu", catalog = "Sunshine_final")
public class Phieuthu implements java.io.Serializable {

	private int ptId;
	private String sophieu;
	private Date ngaylap;
	private String nguoilap;
	private int tongtien;
	private String ghichu;
	private Set<Hocphi> hocphis = new HashSet<Hocphi>(0);

	public Phieuthu() {
	}

	public Phieuthu(int ptId, String sophieu, Date ngaylap, String nguoilap,
			int tongtien) {
		this.ptId = ptId;
		this.sophieu = sophieu;
		this.ngaylap = ngaylap;
		this.nguoilap = nguoilap;
		this.tongtien = tongtien;
	}

	public Phieuthu(int ptId, String sophieu, Date ngaylap, String nguoilap,
			int tongtien, String ghichu, Set<Hocphi> hocphis) {
		this.ptId = ptId;
		this.sophieu = sophieu;
		this.ngaylap = ngaylap;
		this.nguoilap = nguoilap;
		this.tongtien = tongtien;
		this.ghichu = ghichu;
		this.hocphis = hocphis;
	}

	@Id
	@Column(name = "PtId", unique = true, nullable = false)
	public int getPtId() {
		return this.ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	@Column(name = "Sophieu", nullable = false, length = 50)
	public String getSophieu() {
		return this.sophieu;
	}

	public void setSophieu(String sophieu) {
		this.sophieu = sophieu;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Ngaylap", nullable = false, length = 23)
	public Date getNgaylap() {
		return this.ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}

	@Column(name = "Nguoilap", nullable = false, length = 250)
	public String getNguoilap() {
		return this.nguoilap;
	}

	public void setNguoilap(String nguoilap) {
		this.nguoilap = nguoilap;
	}

	@Column(name = "Tongtien", nullable = false)
	public int getTongtien() {
		return this.tongtien;
	}

	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phieuthu")
	public Set<Hocphi> getHocphis() {
		return this.hocphis;
	}

	public void setHocphis(Set<Hocphi> hocphis) {
		this.hocphis = hocphis;
	}

}
