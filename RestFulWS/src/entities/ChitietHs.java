package entities;

// Generated Nov 27, 2015 10:37:07 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ChitietHs generated by hbm2java
 */
@Entity
@Table(name = "ChitietHS", catalog = "Sunshine_final")
public class ChitietHs implements java.io.Serializable {

	private int maBm;
	private String bo;
	private String sdtB;
	private String jobB;
	private String me;
	private String sdtM;
	private String jobM;
	private String sdtCd;
	private String diachi;
	private Set<Hocsinh> hocsinhs = new HashSet<Hocsinh>(0);

	public ChitietHs() {
	}

	public ChitietHs(int maBm) {
		this.maBm = maBm;
	}

	public ChitietHs(int maBm, String bo, String sdtB, String jobB, String me,
			String sdtM, String jobM, String sdtCd, String diachi,
			Set<Hocsinh> hocsinhs) {
		this.maBm = maBm;
		this.bo = bo;
		this.sdtB = sdtB;
		this.jobB = jobB;
		this.me = me;
		this.sdtM = sdtM;
		this.jobM = jobM;
		this.sdtCd = sdtCd;
		this.diachi = diachi;
		this.hocsinhs = hocsinhs;
	}

	@Id
	@Column(name = "MaBM", unique = true, nullable = false)
	public int getMaBm() {
		return this.maBm;
	}

	public void setMaBm(int maBm) {
		this.maBm = maBm;
	}

	@Column(name = "Bo", length = 250)
	public String getBo() {
		return this.bo;
	}

	public void setBo(String bo) {
		this.bo = bo;
	}

	@Column(name = "SdtB", length = 50)
	public String getSdtB() {
		return this.sdtB;
	}

	public void setSdtB(String sdtB) {
		this.sdtB = sdtB;
	}

	@Column(name = "JobB", length = 500)
	public String getJobB() {
		return this.jobB;
	}

	public void setJobB(String jobB) {
		this.jobB = jobB;
	}

	@Column(name = "Me", length = 250)
	public String getMe() {
		return this.me;
	}

	public void setMe(String me) {
		this.me = me;
	}

	@Column(name = "SdtM", length = 50)
	public String getSdtM() {
		return this.sdtM;
	}

	public void setSdtM(String sdtM) {
		this.sdtM = sdtM;
	}

	@Column(name = "JobM", length = 500)
	public String getJobM() {
		return this.jobM;
	}

	public void setJobM(String jobM) {
		this.jobM = jobM;
	}

	@Column(name = "SdtCD", length = 50)
	public String getSdtCd() {
		return this.sdtCd;
	}

	public void setSdtCd(String sdtCd) {
		this.sdtCd = sdtCd;
	}

	@Column(name = "Diachi", length = 500)
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chitietHs")
	public Set<Hocsinh> getHocsinhs() {
		return this.hocsinhs;
	}

	public void setHocsinhs(Set<Hocsinh> hocsinhs) {
		this.hocsinhs = hocsinhs;
	}

}
