package entities;

// Generated Apr 7, 2016 1:58:36 PM by Hibernate Tools 3.4.0.CR1

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
 * Diem generated by hbm2java
 */
@Entity
@Table(name = "Diem", catalog = "Tracnghiem")
public class Diem implements java.io.Serializable {

	private DiemId id;
	private Nguoichoi user;
	private Monhoc monhoc;
	private Capdo capdo;

	public Diem() {
	}

	public Diem(DiemId id, Nguoichoi user, Monhoc monhoc, Capdo capdo) {
		this.id = id;
		this.user = user;
		this.monhoc = monhoc;
		this.capdo = capdo;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "maTk", column = @Column(name = "MaTk", nullable = false)),
			@AttributeOverride(name = "maUser", column = @Column(name = "MaUser", nullable = false)),
			@AttributeOverride(name = "ngaythi", column = @Column(name = "Ngaythi", nullable = false, length = 23)),
			@AttributeOverride(name = "maCd", column = @Column(name = "MaCd", nullable = false)),
			@AttributeOverride(name = "maMh", column = @Column(name = "MaMh", nullable = false)),
			@AttributeOverride(name = "diem", column = @Column(name = "Diem", nullable = false, length = 50)),
			@AttributeOverride(name = "ghichu", column = @Column(name = "Ghichu", length = 50)) })
	public DiemId getId() {
		return this.id;
	}

	public void setId(DiemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaUser", nullable = false, insertable = false, updatable = false)
	public Nguoichoi getUser() {
		return this.user;
	}

	public void setUser(Nguoichoi user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMh", nullable = false, insertable = false, updatable = false)
	public Monhoc getMonhoc() {
		return this.monhoc;
	}

	public void setMonhoc(Monhoc monhoc) {
		this.monhoc = monhoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaCd", nullable = false, insertable = false, updatable = false)
	public Capdo getCapdo() {
		return this.capdo;
	}

	public void setCapdo(Capdo capdo) {
		this.capdo = capdo;
	}

}
