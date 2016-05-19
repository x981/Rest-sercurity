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
 * MenuCon generated by hbm2java
 */
@Entity
@Table(name = "MenuCon", catalog = "Sunshine_final")
public class MenuCon implements java.io.Serializable {

	private int maMnCon;
	private Menu menu;
	private String tenMnCon;
	private Integer thutu;
	private String image;
	private String action;

	public MenuCon() {
	}

	public MenuCon(int maMnCon, Menu menu) {
		this.maMnCon = maMnCon;
		this.menu = menu;
	}

	public MenuCon(int maMnCon, Menu menu, String tenMnCon, Integer thutu,
			String image, String action) {
		this.maMnCon = maMnCon;
		this.menu = menu;
		this.tenMnCon = tenMnCon;
		this.thutu = thutu;
		this.image = image;
		this.action = action;
	}

	@Id
	@Column(name = "MaMnCon", unique = true, nullable = false)
	public int getMaMnCon() {
		return this.maMnCon;
	}

	public void setMaMnCon(int maMnCon) {
		this.maMnCon = maMnCon;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMenu", nullable = false)
	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Column(name = "TenMnCon", length = 50)
	public String getTenMnCon() {
		return this.tenMnCon;
	}

	public void setTenMnCon(String tenMnCon) {
		this.tenMnCon = tenMnCon;
	}

	@Column(name = "Thutu")
	public Integer getThutu() {
		return this.thutu;
	}

	public void setThutu(Integer thutu) {
		this.thutu = thutu;
	}

	@Column(name = "Image", length = 50)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "Action", length = 50)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
