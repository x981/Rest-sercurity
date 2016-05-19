package entities;

// Generated Nov 27, 2015 10:37:07 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Kho generated by hbm2java
 */
@Entity
@Table(name = "Kho", catalog = "Sunshine_final")
public class Kho implements java.io.Serializable {

	private int maKho;
	private String tenkho;
	private String ghichu;
	private Set<Nhaplai> nhaplais = new HashSet<Nhaplai>(0);
	private Set<Tonkho> tonkhos = new HashSet<Tonkho>(0);
	private Set<XuatkhoNb> xuatkhoNbsForKhonhap = new HashSet<XuatkhoNb>(0);
	private Set<NhapkhoNb> nhapkhoNbsForKhonhap = new HashSet<NhapkhoNb>(0);
	private Set<Nhapkho> nhapkhos = new HashSet<Nhapkho>(0);
	private Set<XuatkhoNb> xuatkhoNbsForKhoxuat = new HashSet<XuatkhoNb>(0);
	private Set<TonghopNxt> tonghopNxts = new HashSet<TonghopNxt>(0);
	private Set<NhapkhoNb> nhapkhoNbsForKhoxuat = new HashSet<NhapkhoNb>(0);
	private Set<Xuatkho> xuatkhos = new HashSet<Xuatkho>(0);

	public Kho() {
	}

	public Kho(int maKho, String tenkho) {
		this.maKho = maKho;
		this.tenkho = tenkho;
	}

	public Kho(int maKho, String tenkho, String ghichu, Set<Nhaplai> nhaplais,
			Set<Tonkho> tonkhos, Set<XuatkhoNb> xuatkhoNbsForKhonhap,
			Set<NhapkhoNb> nhapkhoNbsForKhonhap, Set<Nhapkho> nhapkhos,
			Set<XuatkhoNb> xuatkhoNbsForKhoxuat, Set<TonghopNxt> tonghopNxts,
			Set<NhapkhoNb> nhapkhoNbsForKhoxuat, Set<Xuatkho> xuatkhos) {
		this.maKho = maKho;
		this.tenkho = tenkho;
		this.ghichu = ghichu;
		this.nhaplais = nhaplais;
		this.tonkhos = tonkhos;
		this.xuatkhoNbsForKhonhap = xuatkhoNbsForKhonhap;
		this.nhapkhoNbsForKhonhap = nhapkhoNbsForKhonhap;
		this.nhapkhos = nhapkhos;
		this.xuatkhoNbsForKhoxuat = xuatkhoNbsForKhoxuat;
		this.tonghopNxts = tonghopNxts;
		this.nhapkhoNbsForKhoxuat = nhapkhoNbsForKhoxuat;
		this.xuatkhos = xuatkhos;
	}

	@Id
	@Column(name = "MaKho", unique = true, nullable = false)
	public int getMaKho() {
		return this.maKho;
	}

	public void setMaKho(int maKho) {
		this.maKho = maKho;
	}

	@Column(name = "Tenkho", nullable = false, length = 50)
	public String getTenkho() {
		return this.tenkho;
	}

	public void setTenkho(String tenkho) {
		this.tenkho = tenkho;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kho")
	public Set<Nhaplai> getNhaplais() {
		return this.nhaplais;
	}

	public void setNhaplais(Set<Nhaplai> nhaplais) {
		this.nhaplais = nhaplais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kho")
	public Set<Tonkho> getTonkhos() {
		return this.tonkhos;
	}

	public void setTonkhos(Set<Tonkho> tonkhos) {
		this.tonkhos = tonkhos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoByKhonhap")
	public Set<XuatkhoNb> getXuatkhoNbsForKhonhap() {
		return this.xuatkhoNbsForKhonhap;
	}

	public void setXuatkhoNbsForKhonhap(Set<XuatkhoNb> xuatkhoNbsForKhonhap) {
		this.xuatkhoNbsForKhonhap = xuatkhoNbsForKhonhap;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoByKhonhap")
	public Set<NhapkhoNb> getNhapkhoNbsForKhonhap() {
		return this.nhapkhoNbsForKhonhap;
	}

	public void setNhapkhoNbsForKhonhap(Set<NhapkhoNb> nhapkhoNbsForKhonhap) {
		this.nhapkhoNbsForKhonhap = nhapkhoNbsForKhonhap;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kho")
	public Set<Nhapkho> getNhapkhos() {
		return this.nhapkhos;
	}

	public void setNhapkhos(Set<Nhapkho> nhapkhos) {
		this.nhapkhos = nhapkhos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoByKhoxuat")
	public Set<XuatkhoNb> getXuatkhoNbsForKhoxuat() {
		return this.xuatkhoNbsForKhoxuat;
	}

	public void setXuatkhoNbsForKhoxuat(Set<XuatkhoNb> xuatkhoNbsForKhoxuat) {
		this.xuatkhoNbsForKhoxuat = xuatkhoNbsForKhoxuat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kho")
	public Set<TonghopNxt> getTonghopNxts() {
		return this.tonghopNxts;
	}

	public void setTonghopNxts(Set<TonghopNxt> tonghopNxts) {
		this.tonghopNxts = tonghopNxts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoByKhoxuat")
	public Set<NhapkhoNb> getNhapkhoNbsForKhoxuat() {
		return this.nhapkhoNbsForKhoxuat;
	}

	public void setNhapkhoNbsForKhoxuat(Set<NhapkhoNb> nhapkhoNbsForKhoxuat) {
		this.nhapkhoNbsForKhoxuat = nhapkhoNbsForKhoxuat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kho")
	public Set<Xuatkho> getXuatkhos() {
		return this.xuatkhos;
	}

	public void setXuatkhos(Set<Xuatkho> xuatkhos) {
		this.xuatkhos = xuatkhos;
	}

}