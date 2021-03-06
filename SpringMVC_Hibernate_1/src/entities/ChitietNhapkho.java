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
 * ChitietNhapkho generated by hbm2java
 */
@Entity
@Table(name = "ChitietNhapkho", catalog = "Sunshine_final")
public class ChitietNhapkho implements java.io.Serializable {

	private int maCt;
	private Hanghoa hanghoa;
	private Nhapkho nhapkho;
	private Integer dongia;
	private int soluong;
	private Integer chietkhau;
	private Integer thanhtien;
	private String ghichu;

	public ChitietNhapkho() {
	}

	public ChitietNhapkho(int maCt, Hanghoa hanghoa, Nhapkho nhapkho,
			int soluong) {
		this.maCt = maCt;
		this.hanghoa = hanghoa;
		this.nhapkho = nhapkho;
		this.soluong = soluong;
	}

	public ChitietNhapkho(int maCt, Hanghoa hanghoa, Nhapkho nhapkho,
			Integer dongia, int soluong, Integer chietkhau, Integer thanhtien,
			String ghichu) {
		this.maCt = maCt;
		this.hanghoa = hanghoa;
		this.nhapkho = nhapkho;
		this.dongia = dongia;
		this.soluong = soluong;
		this.chietkhau = chietkhau;
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
	@JoinColumn(name = "Mahang", nullable = false)
	public Hanghoa getHanghoa() {
		return this.hanghoa;
	}

	public void setHanghoa(Hanghoa hanghoa) {
		this.hanghoa = hanghoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Malo", nullable = false)
	public Nhapkho getNhapkho() {
		return this.nhapkho;
	}

	public void setNhapkho(Nhapkho nhapkho) {
		this.nhapkho = nhapkho;
	}

	@Column(name = "Dongia")
	public Integer getDongia() {
		return this.dongia;
	}

	public void setDongia(Integer dongia) {
		this.dongia = dongia;
	}

	@Column(name = "Soluong", nullable = false)
	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Column(name = "Chietkhau")
	public Integer getChietkhau() {
		return this.chietkhau;
	}

	public void setChietkhau(Integer chietkhau) {
		this.chietkhau = chietkhau;
	}

	@Column(name = "Thanhtien")
	public Integer getThanhtien() {
		return this.thanhtien;
	}

	public void setThanhtien(Integer thanhtien) {
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
