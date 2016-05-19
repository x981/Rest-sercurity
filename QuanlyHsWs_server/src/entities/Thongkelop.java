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
 * Thongkelop generated by hbm2java
 */
@Entity
@Table(name = "Thongkelop", catalog = "Sunshine_final")
public class Thongkelop implements java.io.Serializable {

	private int maTk;
	private Lophoc lophoc;
	private int thang;
	private int nam;
	private int soHs;
	private int somoi;
	private int sochuyenden;
	private int sodi;
	private int songhi;
	private int sono;
	private String ghichu;

	public Thongkelop() {
	}

	public Thongkelop(int maTk, Lophoc lophoc, int thang, int nam, int soHs,
			int somoi, int sochuyenden, int sodi, int songhi, int sono) {
		this.maTk = maTk;
		this.lophoc = lophoc;
		this.thang = thang;
		this.nam = nam;
		this.soHs = soHs;
		this.somoi = somoi;
		this.sochuyenden = sochuyenden;
		this.sodi = sodi;
		this.songhi = songhi;
		this.sono = sono;
	}

	public Thongkelop(int maTk, Lophoc lophoc, int thang, int nam, int soHs,
			int somoi, int sochuyenden, int sodi, int songhi, int sono,
			String ghichu) {
		this.maTk = maTk;
		this.lophoc = lophoc;
		this.thang = thang;
		this.nam = nam;
		this.soHs = soHs;
		this.somoi = somoi;
		this.sochuyenden = sochuyenden;
		this.sodi = sodi;
		this.songhi = songhi;
		this.sono = sono;
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
	@JoinColumn(name = "Malop", nullable = false)
	public Lophoc getLophoc() {
		return this.lophoc;
	}

	public void setLophoc(Lophoc lophoc) {
		this.lophoc = lophoc;
	}

	@Column(name = "Thang", nullable = false)
	public int getThang() {
		return this.thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	@Column(name = "nam", nullable = false)
	public int getNam() {
		return this.nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	@Column(name = "SoHs", nullable = false)
	public int getSoHs() {
		return this.soHs;
	}

	public void setSoHs(int soHs) {
		this.soHs = soHs;
	}

	@Column(name = "Somoi", nullable = false)
	public int getSomoi() {
		return this.somoi;
	}

	public void setSomoi(int somoi) {
		this.somoi = somoi;
	}

	@Column(name = "Sochuyenden", nullable = false)
	public int getSochuyenden() {
		return this.sochuyenden;
	}

	public void setSochuyenden(int sochuyenden) {
		this.sochuyenden = sochuyenden;
	}

	@Column(name = "Sodi", nullable = false)
	public int getSodi() {
		return this.sodi;
	}

	public void setSodi(int sodi) {
		this.sodi = sodi;
	}

	@Column(name = "Songhi", nullable = false)
	public int getSonghi() {
		return this.songhi;
	}

	public void setSonghi(int songhi) {
		this.songhi = songhi;
	}

	@Column(name = "Sono", nullable = false)
	public int getSono() {
		return this.sono;
	}

	public void setSono(int sono) {
		this.sono = sono;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}
