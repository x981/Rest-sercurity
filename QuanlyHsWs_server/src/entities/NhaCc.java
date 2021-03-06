package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NhaCc generated by hbm2java
 */
@Entity
@Table(name = "NhaCC", catalog = "Sunshine_final")
public class NhaCc implements java.io.Serializable {

	private int maNcc;
	private String tenNcc;
	private String sdt;
	private String email;
	private String diachi;
	private String ghichu;
	private Set<NhapkhoNb> nhapkhoNbs = new HashSet<NhapkhoNb>(0);
	private Set<Nhapkho> nhapkhos = new HashSet<Nhapkho>(0);

	public NhaCc() {
	}

	public NhaCc(int maNcc, String tenNcc) {
		this.maNcc = maNcc;
		this.tenNcc = tenNcc;
	}

	public NhaCc(int maNcc, String tenNcc, String sdt, String email,
			String diachi, String ghichu, Set<NhapkhoNb> nhapkhoNbs,
			Set<Nhapkho> nhapkhos) {
		this.maNcc = maNcc;
		this.tenNcc = tenNcc;
		this.sdt = sdt;
		this.email = email;
		this.diachi = diachi;
		this.ghichu = ghichu;
		this.nhapkhoNbs = nhapkhoNbs;
		this.nhapkhos = nhapkhos;
	}

	@Id
	@Column(name = "MaNcc", unique = true, nullable = false)
	public int getMaNcc() {
		return this.maNcc;
	}

	public void setMaNcc(int maNcc) {
		this.maNcc = maNcc;
	}

	@Column(name = "TenNcc", nullable = false, length = 250)
	public String getTenNcc() {
		return this.tenNcc;
	}

	public void setTenNcc(String tenNcc) {
		this.tenNcc = tenNcc;
	}

	@Column(name = "Sdt", length = 50)
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Column(name = "Email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Diachi", length = 250)
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoByKhoxuat")
	public Set<NhapkhoNb> getNhapkhoNbs() {
		return this.nhapkhoNbs;
	}

	public void setNhapkhoNbs(Set<NhapkhoNb> nhapkhoNbs) {
		this.nhapkhoNbs = nhapkhoNbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhaCc")
	public Set<Nhapkho> getNhapkhos() {
		return this.nhapkhos;
	}

	public void setNhapkhos(Set<Nhapkho> nhapkhos) {
		this.nhapkhos = nhapkhos;
	}

}
