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
 * Danhmuc generated by hbm2java
 */
@Entity
@Table(name = "Danhmuc", catalog = "Sunshine_final")
public class Danhmuc implements java.io.Serializable {

	private int maDm;
	private String tenDm;
	private String ghichu;
	private Set<Hanghoa> hanghoas = new HashSet<Hanghoa>(0);

	public Danhmuc() {
	}

	public Danhmuc(int maDm) {
		this.maDm = maDm;
	}

	public Danhmuc(int maDm, String tenDm, String ghichu, Set<Hanghoa> hanghoas) {
		this.maDm = maDm;
		this.tenDm = tenDm;
		this.ghichu = ghichu;
		this.hanghoas = hanghoas;
	}

	@Id
	@Column(name = "MaDm", unique = true, nullable = false)
	public int getMaDm() {
		return this.maDm;
	}

	public void setMaDm(int maDm) {
		this.maDm = maDm;
	}

	@Column(name = "TenDm", length = 50)
	public String getTenDm() {
		return this.tenDm;
	}

	public void setTenDm(String tenDm) {
		this.tenDm = tenDm;
	}

	@Column(name = "Ghichu", length = 250)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "danhmuc")
	public Set<Hanghoa> getHanghoas() {
		return this.hanghoas;
	}

	public void setHanghoas(Set<Hanghoa> hanghoas) {
		this.hanghoas = hanghoas;
	}

}
