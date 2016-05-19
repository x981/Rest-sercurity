package entities;

// Generated Dec 21, 2015 2:53:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Lophoc generated by hbm2java
 */
@Entity
@Table(name = "Lophoc", catalog = "Qlydiem")
public class Lophoc implements java.io.Serializable {

	private int maLop;
	private String tenlop;
	@JsonIgnore
	private Set<Sinhvien> sinhviens = new HashSet<Sinhvien>(0);

	public Lophoc() {
	}

	public Lophoc(int maLop, String tenlop) {
		this.maLop = maLop;
		this.tenlop = tenlop;
	}

	public Lophoc(int maLop, String tenlop, Set<Sinhvien> sinhviens) {
		this.maLop = maLop;
		this.tenlop = tenlop;
		this.sinhviens = sinhviens;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaLop", unique = true, nullable = false)
	public int getMaLop() {
		return this.maLop;
	}

	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}

	@Column(name = "Tenlop", nullable = false, length = 50)
	public String getTenlop() {
		return this.tenlop;
	}

	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lophoc")
	public Set<Sinhvien> getSinhviens() {
		return this.sinhviens;
	}

	public void setSinhviens(Set<Sinhvien> sinhviens) {
		this.sinhviens = sinhviens;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenlop;
	}

}
