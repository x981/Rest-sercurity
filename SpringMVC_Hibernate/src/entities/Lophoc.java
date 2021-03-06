package entities;

// Generated Dec 17, 2015 9:55:19 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Lophoc generated by hbm2java
 */
@Entity
@Table(name = "Lophoc", catalog = "Sunshine_final")
@XmlRootElement(name="lophoc")
public class Lophoc implements java.io.Serializable {

	private int maLop;
	private Giaovien giaovien;
	private String tenlop;
	private Date ngayKg;
	private Integer siso;
	private String trangthai;
	private String expried;
	private String ghichu;
	private Set<Hocsinh> hocsinhs = new HashSet<Hocsinh>(0);
	private Set<DiemHs> diemHses = new HashSet<DiemHs>(0);
	private Set<NhatkyLh> nhatkyLhs = new HashSet<NhatkyLh>(0);
	private Set<ChitietLop> chitietLops = new HashSet<ChitietLop>(0);
	private Set<Hocphi> hocphis = new HashSet<Hocphi>(0);
	private Set<Thongkelop> thongkelops = new HashSet<Thongkelop>(0);
	private Set<Lopdahoc> lopdahocs = new HashSet<Lopdahoc>(0);

	public Lophoc() {
	}

	public Lophoc(int maLop) {
		this.maLop = maLop;
	}

	public Lophoc(int maLop, Giaovien giaovien, String tenlop, Date ngayKg,
			Integer siso, String trangthai, String expried, String ghichu,
			Set<Hocsinh> hocsinhs, Set<DiemHs> diemHses,
			Set<NhatkyLh> nhatkyLhs, Set<ChitietLop> chitietLops,
			Set<Hocphi> hocphis, Set<Thongkelop> thongkelops,
			Set<Lopdahoc> lopdahocs) {
		this.maLop = maLop;
		this.giaovien = giaovien;
		this.tenlop = tenlop;
		this.ngayKg = ngayKg;
		this.siso = siso;
		this.trangthai = trangthai;
		this.expried = expried;
		this.ghichu = ghichu;
		this.hocsinhs = hocsinhs;
		this.diemHses = diemHses;
		this.nhatkyLhs = nhatkyLhs;
		this.chitietLops = chitietLops;
		this.hocphis = hocphis;
		this.thongkelops = thongkelops;
		this.lopdahocs = lopdahocs;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaLop", unique = true, nullable = false)
	public int getMaLop() {
		return this.maLop;
	}

	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaGV")
	public Giaovien getGiaovien() {
		return this.giaovien;
	}

	public void setGiaovien(Giaovien giaovien) {
		this.giaovien = giaovien;
	}

	@Column(name = "Tenlop", length = 50)
	public String getTenlop() {
		return this.tenlop;
	}

	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NgayKG", length = 23)
	public Date getNgayKg() {
		return this.ngayKg;
	}

	public void setNgayKg(Date ngayKg) {
		this.ngayKg = ngayKg;
	}

	@Column(name = "Siso")
	public Integer getSiso() {
		return this.siso;
	}

	public void setSiso(Integer siso) {
		this.siso = siso;
	}

	@Column(name = "Trangthai", length = 10)
	public String getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	@Column(name = "Expried", length = 10)
	public String getExpried() {
		return this.expried;
	}

	public void setExpried(String expried) {
		this.expried = expried;
	}

	@Column(name = "Ghichu", length = 10)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<Hocsinh> getHocsinhs() {
		return this.hocsinhs;
	}

	public void setHocsinhs(Set<Hocsinh> hocsinhs) {
		this.hocsinhs = hocsinhs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<DiemHs> getDiemHses() {
		return this.diemHses;
	}

	public void setDiemHses(Set<DiemHs> diemHses) {
		this.diemHses = diemHses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<NhatkyLh> getNhatkyLhs() {
		return this.nhatkyLhs;
	}

	public void setNhatkyLhs(Set<NhatkyLh> nhatkyLhs) {
		this.nhatkyLhs = nhatkyLhs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<ChitietLop> getChitietLops() {
		return this.chitietLops;
	}

	public void setChitietLops(Set<ChitietLop> chitietLops) {
		this.chitietLops = chitietLops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<Hocphi> getHocphis() {
		return this.hocphis;
	}

	public void setHocphis(Set<Hocphi> hocphis) {
		this.hocphis = hocphis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<Thongkelop> getThongkelops() {
		return this.thongkelops;
	}

	public void setThongkelops(Set<Thongkelop> thongkelops) {
		this.thongkelops = thongkelops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<Lopdahoc> getLopdahocs() {
		return this.lopdahocs;
	}

	public void setLopdahocs(Set<Lopdahoc> lopdahocs) {
		this.lopdahocs = lopdahocs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenlop;
	}

}
