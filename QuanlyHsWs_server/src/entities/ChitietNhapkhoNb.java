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
 * ChitietNhapkhoNb generated by hbm2java
 */
@Entity
@Table(name = "ChitietNhapkhoNB", catalog = "Sunshine_final")
public class ChitietNhapkhoNb implements java.io.Serializable {

	private int maCt;
	private NhapkhoNb nhapkhoNb;
	private Hanghoa hanghoa;
	private Nhapkho nhapkho;
	private int soluong;
	private String ghichu;

	public ChitietNhapkhoNb() {
	}

	public ChitietNhapkhoNb(int maCt, NhapkhoNb nhapkhoNb, Hanghoa hanghoa,
			Nhapkho nhapkho, int soluong) {
		this.maCt = maCt;
		this.nhapkhoNb = nhapkhoNb;
		this.hanghoa = hanghoa;
		this.nhapkho = nhapkho;
		this.soluong = soluong;
	}

	public ChitietNhapkhoNb(int maCt, NhapkhoNb nhapkhoNb, Hanghoa hanghoa,
			Nhapkho nhapkho, int soluong, String ghichu) {
		this.maCt = maCt;
		this.nhapkhoNb = nhapkhoNb;
		this.hanghoa = hanghoa;
		this.nhapkho = nhapkho;
		this.soluong = soluong;
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
	public NhapkhoNb getNhapkhoNb() {
		return this.nhapkhoNb;
	}

	public void setNhapkhoNb(NhapkhoNb nhapkhoNb) {
		this.nhapkhoNb = nhapkhoNb;
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

	@Column(name = "Soluong", nullable = false)
	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}
