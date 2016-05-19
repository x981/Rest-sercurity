package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "Menu", catalog = "Sunshine_final")
public class Menu implements java.io.Serializable {

	private int maMenu;
	private String tenMenu;
	private String menuCha;
	private int thutu;
	private String image;
	private String action;
	private Set<MenuCon> menuCons = new HashSet<MenuCon>(0);
	private Set<Quyen> quyens = new HashSet<Quyen>(0);

	public Menu() {
	}

	public Menu(int maMenu, String tenMenu, String menuCha, int thutu,
			String action) {
		this.maMenu = maMenu;
		this.tenMenu = tenMenu;
		this.menuCha = menuCha;
		this.thutu = thutu;
		this.action = action;
	}

	public Menu(int maMenu, String tenMenu, String menuCha, int thutu,
			String image, String action, Set<MenuCon> menuCons,
			Set<Quyen> quyens) {
		this.maMenu = maMenu;
		this.tenMenu = tenMenu;
		this.menuCha = menuCha;
		this.thutu = thutu;
		this.image = image;
		this.action = action;
		this.menuCons = menuCons;
		this.quyens = quyens;
	}

	@Id
	@Column(name = "MaMenu", unique = true, nullable = false)
	public int getMaMenu() {
		return this.maMenu;
	}

	public void setMaMenu(int maMenu) {
		this.maMenu = maMenu;
	}

	@Column(name = "TenMenu", nullable = false, length = 50)
	public String getTenMenu() {
		return this.tenMenu;
	}

	public void setTenMenu(String tenMenu) {
		this.tenMenu = tenMenu;
	}

	@Column(name = "MenuCha", nullable = false, length = 50)
	public String getMenuCha() {
		return this.menuCha;
	}

	public void setMenuCha(String menuCha) {
		this.menuCha = menuCha;
	}

	@Column(name = "Thutu", nullable = false)
	public int getThutu() {
		return this.thutu;
	}

	public void setThutu(int thutu) {
		this.thutu = thutu;
	}

	@Column(name = "image", length = 50)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "Action", nullable = false, length = 50)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
	public Set<MenuCon> getMenuCons() {
		return this.menuCons;
	}

	public void setMenuCons(Set<MenuCon> menuCons) {
		this.menuCons = menuCons;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "menus")
	public Set<Quyen> getQuyens() {
		return this.quyens;
	}

	public void setQuyens(Set<Quyen> quyens) {
		this.quyens = quyens;
	}

}
