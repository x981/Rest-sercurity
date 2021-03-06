package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

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
 * XuatkhoNb generated by hbm2java
 */
@Entity
@Table(name = "XuatkhoNB", catalog = "Sunshine_final")
public class XuatkhoNb implements java.io.Serializable {

	private int maPx;
	private Giaovien giaovien;
	private Kho khoByKhonhap;
	private Kho khoByKhoxuat;
	private String sophieu;
	private Date ngayxuat;
	private int nguoinhan;
	private String ghichu;
	private Set<ChitietXuatkhoNb> chitietXuatkhoNbs = new HashSet<ChitietXuatkhoNb>(
			0);

	public XuatkhoNb() {
	}

	public XuatkhoNb(int maPx, Giaovien giaovien, Kho khoByKhonhap,
			Kho khoByKhoxuat, String sophieu, Date ngayxuat, int nguoinhan) {
		this.maPx = maPx;
		this.giaovien = giaovien;
		this.khoByKhonhap = khoByKhonhap;
		this.khoByKhoxuat = khoByKhoxuat;
		this.sophieu = sophieu;
		this.ngayxuat = ngayxuat;
		this.nguoinhan = nguoinhan;
	}

	public XuatkhoNb(int maPx, Giaovien giaovien, Kho khoByKhonhap,
			Kho khoByKhoxuat, String sophieu, Date ngayxuat, int nguoinhan,
			String ghichu, Set<ChitietXuatkhoNb> chitietXuatkhoNbs) {
		this.maPx = maPx;
		this.giaovien = giaovien;
		this.khoByKhonhap = khoByKhonhap;
		this.khoByKhoxuat = khoByKhoxuat;
		this.sophieu = sophieu;
		this.ngayxuat = ngayxuat;
		this.nguoinhan = nguoinhan;
		this.ghichu = ghichu;
		this.chitietXuatkhoNbs = chitietXuatkhoNbs;
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
	@JoinColumn(name = "Nguoixuat", nullable = false)
	public Giaovien getGiaovien() {
		return this.giaovien;
	}

	public void setGiaovien(Giaovien giaovien) {
		this.giaovien = giaovien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Khonhap", nullable = false)
	public Kho getKhoByKhonhap() {
		return this.khoByKhonhap;
	}

	public void setKhoByKhonhap(Kho khoByKhonhap) {
		this.khoByKhonhap = khoByKhonhap;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Khoxuat", nullable = false)
	public Kho getKhoByKhoxuat() {
		return this.khoByKhoxuat;
	}

	public void setKhoByKhoxuat(Kho khoByKhoxuat) {
		this.khoByKhoxuat = khoByKhoxuat;
	}

	@Column(name = "Sophieu", nullable = false, length = 50)
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

	@Column(name = "Nguoinhan", nullable = false)
	public int getNguoinhan() {
		return this.nguoinhan;
	}

	public void setNguoinhan(int nguoinhan) {
		this.nguoinhan = nguoinhan;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "xuatkhoNb")
	public Set<ChitietXuatkhoNb> getChitietXuatkhoNbs() {
		return this.chitietXuatkhoNbs;
	}

	public void setChitietXuatkhoNbs(Set<ChitietXuatkhoNb> chitietXuatkhoNbs) {
		this.chitietXuatkhoNbs = chitietXuatkhoNbs;
	}

}
