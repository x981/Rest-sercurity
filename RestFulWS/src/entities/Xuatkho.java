package entities;

// Generated Nov 27, 2015 10:37:07 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Xuatkho generated by hbm2java
 */
@Entity
@Table(name = "Xuatkho", catalog = "Sunshine_final")
public class Xuatkho implements java.io.Serializable {

	private int maPx;
	private Kho kho;
	private Giaovien giaovien;
	private String sophieu;
	private Date ngayxuat;
	private int tongtien;
	private String ghichu;
	private Set<ChitietXuatkho> chitietXuatkhos = new HashSet<ChitietXuatkho>(0);

	public Xuatkho() {
	}

	public Xuatkho(int maPx, Kho kho, Giaovien giaovien, String sophieu,
			Date ngayxuat, int tongtien) {
		this.maPx = maPx;
		this.kho = kho;
		this.giaovien = giaovien;
		this.sophieu = sophieu;
		this.ngayxuat = ngayxuat;
		this.tongtien = tongtien;
	}

	public Xuatkho(int maPx, Kho kho, Giaovien giaovien, String sophieu,
			Date ngayxuat, int tongtien, String ghichu,
			Set<ChitietXuatkho> chitietXuatkhos) {
		this.maPx = maPx;
		this.kho = kho;
		this.giaovien = giaovien;
		this.sophieu = sophieu;
		this.ngayxuat = ngayxuat;
		this.tongtien = tongtien;
		this.ghichu = ghichu;
		this.chitietXuatkhos = chitietXuatkhos;
	}

	@Id
	@Column(name = "MaPx", unique = true, nullable = false)
	public int getMaPx() {
		return this.maPx;
	}

	public void setMaPx(int maPx) {
		this.maPx = maPx;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKho", nullable = false)
	public Kho getKho() {
		return this.kho;
	}

	public void setKho(Kho kho) {
		this.kho = kho;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaGv", nullable = false)
	public Giaovien getGiaovien() {
		return this.giaovien;
	}

	public void setGiaovien(Giaovien giaovien) {
		this.giaovien = giaovien;
	}

	@Column(name = "Sophieu", nullable = false, length = 250)
	public String getSophieu() {
		return this.sophieu;
	}

	public void setSophieu(String sophieu) {
		this.sophieu = sophieu;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Ngayxuat", nullable = false, length = 23)
	public Date getNgayxuat() {
		return this.ngayxuat;
	}

	public void setNgayxuat(Date ngayxuat) {
		this.ngayxuat = ngayxuat;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "xuatkho")
	public Set<ChitietXuatkho> getChitietXuatkhos() {
		return this.chitietXuatkhos;
	}

	public void setChitietXuatkhos(Set<ChitietXuatkho> chitietXuatkhos) {
		this.chitietXuatkhos = chitietXuatkhos;
	}

}
