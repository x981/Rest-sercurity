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
 * Doituong generated by hbm2java
 */
@Entity
@Table(name = "Doituong", catalog = "Sunshine_final")
public class Doituong implements java.io.Serializable {

	private int maDt;
	private String tenDt;
	private Integer mucgiam;
	private Double thanhtien;
	private Set<Hocsinh> hocsinhs = new HashSet<Hocsinh>(0);

	public Doituong() {
	}

	public Doituong(int maDt) {
		this.maDt = maDt;
	}

	public Doituong(int maDt, String tenDt, Integer mucgiam, Double thanhtien,
			Set<Hocsinh> hocsinhs) {
		this.maDt = maDt;
		this.tenDt = tenDt;
		this.mucgiam = mucgiam;
		this.thanhtien = thanhtien;
		this.hocsinhs = hocsinhs;
	}

	@Id
	@Column(name = "MaDT", unique = true, nullable = false)
	public int getMaDt() {
		return this.maDt;
	}

	public void setMaDt(int maDt) {
		this.maDt = maDt;
	}

	@Column(name = "TenDT", length = 50)
	public String getTenDt() {
		return this.tenDt;
	}

	public void setTenDt(String tenDt) {
		this.tenDt = tenDt;
	}

	@Column(name = "Mucgiam")
	public Integer getMucgiam() {
		return this.mucgiam;
	}

	public void setMucgiam(Integer mucgiam) {
		this.mucgiam = mucgiam;
	}

	@Column(name = "Thanhtien", precision = 15, scale = 0)
	public Double getThanhtien() {
		return this.thanhtien;
	}

	public void setThanhtien(Double thanhtien) {
		this.thanhtien = thanhtien;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doituong")
	public Set<Hocsinh> getHocsinhs() {
		return this.hocsinhs;
	}

	public void setHocsinhs(Set<Hocsinh> hocsinhs) {
		this.hocsinhs = hocsinhs;
	}

}
