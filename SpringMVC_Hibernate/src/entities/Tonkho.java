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
 * Tonkho generated by hbm2java
 */
@Entity
@Table(name = "Tonkho", catalog = "Sunshine_final")
public class Tonkho implements java.io.Serializable {

	private int maTk;
	private Kho kho;
	private Hanghoa hanghoa;
	private Nhapkho nhapkho;
	private Integer soluong;
	private String ghichu;

	public Tonkho() {
	}

	public Tonkho(int maTk) {
		this.maTk = maTk;
	}

	public Tonkho(int maTk, Kho kho, Hanghoa hanghoa, Nhapkho nhapkho,
			Integer soluong, String ghichu) {
		this.maTk = maTk;
		this.kho = kho;
		this.hanghoa = hanghoa;
		this.nhapkho = nhapkho;
		this.soluong = soluong;
		this.ghichu = ghichu;
	}

	@Id
	@Column(name = "MaTk", unique = true, nullable = false)
	public int getMaTk() {
		return this.maTk;
	}

	public void setMaTk(int maTk) {
		this.maTk = maTk;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Makho")
	public Kho getKho() {
		return this.kho;
	}

	public void setKho(Kho kho) {
		this.kho = kho;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Mahang")
	public Hanghoa getHanghoa() {
		return this.hanghoa;
	}

	public void setHanghoa(Hanghoa hanghoa) {
		this.hanghoa = hanghoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Malo")
	public Nhapkho getNhapkho() {
		return this.nhapkho;
	}

	public void setNhapkho(Nhapkho nhapkho) {
		this.nhapkho = nhapkho;
	}

	@Column(name = "Soluong")
	public Integer getSoluong() {
		return this.soluong;
	}

	public void setSoluong(Integer soluong) {
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
