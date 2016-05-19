package entities;

// Generated Dec 17, 2015 9:55:19 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ChitietXuatkho generated by hbm2java
 */
@Entity
@Table(name = "ChitietXuatkho", catalog = "Sunshine_final")
public class ChitietXuatkho implements java.io.Serializable {

	private int maCt;
	private Xuatkho xuatkho;
	private Hanghoa hanghoa;
	private Hocsinh hocsinh;
	private Nhapkho nhapkho;
	private int dongia;
	private int soluong;
	private int thanhtien;
	private Integer trangthai;
	private String ghichu;

	public ChitietXuatkho() {
	}

	public ChitietXuatkho(int maCt, Xuatkho xuatkho, Hanghoa hanghoa,
			Hocsinh hocsinh, Nhapkho nhapkho, int dongia, int soluong,
			int thanhtien) {
		this.maCt = maCt;
		this.xuatkho = xuatkho;
		this.hanghoa = hanghoa;
		this.hocsinh = hocsinh;
		this.nhapkho = nhapkho;
		this.dongia = dongia;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
	}

	public ChitietXuatkho(int maCt, Xuatkho xuatkho, Hanghoa hanghoa,
			Hocsinh hocsinh, Nhapkho nhapkho, int dongia, int soluong,
			int thanhtien, Integer trangthai, String ghichu) {
		this.maCt = maCt;
		this.xuatkho = xuatkho;
		this.hanghoa = hanghoa;
		this.hocsinh = hocsinh;
		this.nhapkho = nhapkho;
		this.dongia = dongia;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
		this.trangthai = trangthai;
		this.ghichu = ghichu;
	}

	@Id
	@Column(name = "MaCt", unique = true, nullable = false)
	public int getMaCt() {
		return this.maCt;
	}

	public void setMaCt(int maCt) {
		this.maCt = maCt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaPx", nullable = false)
	public Xuatkho getXuatkho() {
		return this.xuatkho;
	}

	public void setXuatkho(Xuatkho xuatkho) {
		this.xuatkho = xuatkho;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Mahang", nullable = false)
	public Hanghoa getHanghoa() {
		return this.hanghoa;
	}

	public void setHanghoa(Hanghoa hanghoa) {
		this.hanghoa = hanghoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHs", nullable = false)
	public Hocsinh getHocsinh() {
		return this.hocsinh;
	}

	public void setHocsinh(Hocsinh hocsinh) {
		this.hocsinh = hocsinh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Malo", nullable = false)
	public Nhapkho getNhapkho() {
		return this.nhapkho;
	}

	public void setNhapkho(Nhapkho nhapkho) {
		this.nhapkho = nhapkho;
	}

	@Column(name = "Dongia", nullable = false)
	public int getDongia() {
		return this.dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	@Column(name = "Soluong", nullable = false)
	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Column(name = "Thanhtien", nullable = false)
	public int getThanhtien() {
		return this.thanhtien;
	}

	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}

	@Column(name = "Trangthai")
	public Integer getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(Integer trangthai) {
		this.trangthai = trangthai;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}
