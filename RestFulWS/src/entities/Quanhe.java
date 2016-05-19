package entities;

// Generated Nov 27, 2015 10:37:07 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Quanhe generated by hbm2java
 */
@Entity
@Table(name = "Quanhe", catalog = "Sunshine_final")
public class Quanhe implements java.io.Serializable {

	private QuanheId id;
	private KieuQuanhe kieuQuanhe;
	private Hocsinh hocsinhByMaHs02;
	private Hocsinh hocsinhByMaHs01;

	public Quanhe() {
	}

	public Quanhe(QuanheId id, KieuQuanhe kieuQuanhe, Hocsinh hocsinhByMaHs02,
			Hocsinh hocsinhByMaHs01) {
		this.id = id;
		this.kieuQuanhe = kieuQuanhe;
		this.hocsinhByMaHs02 = hocsinhByMaHs02;
		this.hocsinhByMaHs01 = hocsinhByMaHs01;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "maHs01", column = @Column(name = "MaHS01", nullable = false)),
			@AttributeOverride(name = "maHs02", column = @Column(name = "MaHS02", nullable = false)) })
	public QuanheId getId() {
		return this.id;
	}

	public void setId(QuanheId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaQH", nullable = false)
	public KieuQuanhe getKieuQuanhe() {
		return this.kieuQuanhe;
	}

	public void setKieuQuanhe(KieuQuanhe kieuQuanhe) {
		this.kieuQuanhe = kieuQuanhe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHS02", nullable = false, insertable = false, updatable = false)
	public Hocsinh getHocsinhByMaHs02() {
		return this.hocsinhByMaHs02;
	}

	public void setHocsinhByMaHs02(Hocsinh hocsinhByMaHs02) {
		this.hocsinhByMaHs02 = hocsinhByMaHs02;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHS01", nullable = false, insertable = false, updatable = false)
	public Hocsinh getHocsinhByMaHs01() {
		return this.hocsinhByMaHs01;
	}

	public void setHocsinhByMaHs01(Hocsinh hocsinhByMaHs01) {
		this.hocsinhByMaHs01 = hocsinhByMaHs01;
	}

}
