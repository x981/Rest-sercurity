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
 * ChitietNhaplai generated by hbm2java
 */
@Entity
@Table(name = "ChitietNhaplai", catalog = "Sunshine_final")
public class ChitietNhaplai implements java.io.Serializable {

	private int maCt;
	private Nhaplai nhaplai;
	private Hanghoa hanghoa;
	private Hocsinh hocsinh;
	private Nhapkho nhapkho;
	private int dongia;
	private int soluong;
	private int thanhtien;
	private String ghichu;

	public ChitietNhaplai() {
	}

	public ChitietNhaplai(int maCt, Nhaplai nhaplai, Hanghoa hanghoa,
			Hocsinh hocsinh, Nhapkho nhapkho, int dongia, int soluong,
			int thanhtien) {
		this.maCt = maCt;
		this.nhaplai = nhaplai;
		this.hanghoa = hanghoa;
		this.hocsinh = hocsinh;
		this.nhapkho = nhapkho;
		this.dongia = dongia;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
	}

	public ChitietNhaplai(int maCt, Nhaplai nhaplai, Hanghoa hanghoa,
			Hocsinh hocsinh, Nhapkho nhapkho, int dongia, int soluong,
			int thanhtien, String ghichu) {
		this.maCt = maCt;
		this.nhaplai = nhaplai;
		this.hanghoa = hanghoa;
		this.hocsinh = hocsinh;
		this.nhapkho = nhapkho;
		this.dongia = dongia;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
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
	@JoinColumn(name = "MaPn", nullable = false)
	public Nhaplai getNhaplai() {
		return this.nhaplai;
	}

	public void setNhaplai(Nhaplai nhaplai) {
		this.nhaplai = nhaplai;
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

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}