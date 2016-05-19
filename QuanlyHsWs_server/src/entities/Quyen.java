package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Quyen generated by hbm2java
 */
@Entity
@Table(name = "Quyen", catalog = "Sunshine_final")
public class Quyen implements java.io.Serializable {

	private int maQuyen;
	private String tenQuyen;
	private Set<Menu> menus = new HashSet<Menu>(0);
	private Set<Nhom> nhoms = new HashSet<Nhom>(0);

	public Quyen() {
	}

	public Quyen(int maQuyen, String tenQuyen) {
		this.maQuyen = maQuyen;
		this.tenQuyen = tenQuyen;
	}

	public Quyen(int maQuyen, String tenQuyen, Set<Menu> menus, Set<Nhom> nhoms) {
		this.maQuyen = maQuyen;
		this.tenQuyen = tenQuyen;
		this.menus = menus;
		this.nhoms = nhoms;
	}

	@Id
	@Column(name = "MaQuyen", unique = true, nullable = false)
	public int getMaQuyen() {
		return this.maQuyen;
	}

	public void setMaQuyen(int maQuyen) {
		this.maQuyen = maQuyen;
	}

	@Column(name = "TenQuyen", nullable = false, length = 50)
	public String getTenQuyen() {
		return this.tenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Quyen_Menu", catalog = "Sunshine_final", joinColumns = { @JoinColumn(name = "MaQuyen", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "MaMenu", nullable = false, updatable = false) })
	public Set<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quyen")
	public Set<Nhom> getNhoms() {
		return this.nhoms;
	}

	public void setNhoms(Set<Nhom> nhoms) {
		this.nhoms = nhoms;
	}

}
