package entities;

// Generated Dec 21, 2015 2:53:04 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Diem generated by hbm2java
 */
@Entity
@Table(name = "Diem", catalog = "Qlydiem")
@XmlRootElement
public class Diem implements java.io.Serializable {

	private DiemId id;
	private Monhoc monhoc;
	private int diem;

	public Diem() {
	}

	public Diem(DiemId id, Monhoc monhoc, int diem) {
		this.id = id;
		this.monhoc = monhoc;
		this.diem = diem;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "maMh", column = @Column(name = "MaMH", nullable = false)),
			@AttributeOverride(name = "maSv", column = @Column(name = "MaSV", nullable = false)) })
	public DiemId getId() {
		return this.id;
	}

	public void setId(DiemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", nullable = false, insertable = false, updatable = false)
	public Monhoc getMonhoc() {
		return this.monhoc;
	}

	public void setMonhoc(Monhoc monhoc) {
		this.monhoc = monhoc;
	}

	@Column(name = "Diem", nullable = false)
	public int getDiem() {
		return this.diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

}
