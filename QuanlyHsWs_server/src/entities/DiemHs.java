package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

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
 * DiemHs generated by hbm2java
 */
@Entity
@Table(name = "DiemHS", catalog = "Sunshine_final")
public class DiemHs implements java.io.Serializable {

	private DiemHsId id;
	private Giaidoan giaidoan;
	private Hocsinh hocsinh;
	private Lophoc lophoc;
	private Float diem;
	private Float diemNoi;
	private Float diemDoc;
	private Float diemViet;
	private String nhanxet;
	private String ghichu;

	public DiemHs() {
	}

	public DiemHs(DiemHsId id, Giaidoan giaidoan, Hocsinh hocsinh, Lophoc lophoc) {
		this.id = id;
		this.giaidoan = giaidoan;
		this.hocsinh = hocsinh;
		this.lophoc = lophoc;
	}

	public DiemHs(DiemHsId id, Giaidoan giaidoan, Hocsinh hocsinh,
			Lophoc lophoc, Float diem, Float diemNoi, Float diemDoc,
			Float diemViet, String nhanxet, String ghichu) {
		this.id = id;
		this.giaidoan = giaidoan;
		this.hocsinh = hocsinh;
		this.lophoc = lophoc;
		this.diem = diem;
		this.diemNoi = diemNoi;
		this.diemDoc = diemDoc;
		this.diemViet = diemViet;
		this.nhanxet = nhanxet;
		this.ghichu = ghichu;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "maGd", column = @Column(name = "MaGD", nullable = false)),
			@AttributeOverride(name = "maLop", column = @Column(name = "MaLop", nullable = false)),
			@AttributeOverride(name = "maHs", column = @Column(name = "MaHS", nullable = false)) })
	public DiemHsId getId() {
		return this.id;
	}

	public void setId(DiemHsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaGD", nullable = false, insertable = false, updatable = false)
	public Giaidoan getGiaidoan() {
		return this.giaidoan;
	}

	public void setGiaidoan(Giaidoan giaidoan) {
		this.giaidoan = giaidoan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHS", nullable = false, insertable = false, updatable = false)
	public Hocsinh getHocsinh() {
		return this.hocsinh;
	}

	public void setHocsinh(Hocsinh hocsinh) {
		this.hocsinh = hocsinh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLop", nullable = false, insertable = false, updatable = false)
	public Lophoc getLophoc() {
		return this.lophoc;
	}

	public void setLophoc(Lophoc lophoc) {
		this.lophoc = lophoc;
	}

	@Column(name = "Diem", precision = 7, scale = 0)
	public Float getDiem() {
		return this.diem;
	}

	public void setDiem(Float diem) {
		this.diem = diem;
	}

	@Column(name = "DiemNoi", precision = 7, scale = 0)
	public Float getDiemNoi() {
		return this.diemNoi;
	}

	public void setDiemNoi(Float diemNoi) {
		this.diemNoi = diemNoi;
	}

	@Column(name = "DiemDoc", precision = 7, scale = 0)
	public Float getDiemDoc() {
		return this.diemDoc;
	}

	public void setDiemDoc(Float diemDoc) {
		this.diemDoc = diemDoc;
	}

	@Column(name = "DiemViet", precision = 7, scale = 0)
	public Float getDiemViet() {
		return this.diemViet;
	}

	public void setDiemViet(Float diemViet) {
		this.diemViet = diemViet;
	}

	@Column(name = "Nhanxet", length = 500)
	public String getNhanxet() {
		return this.nhanxet;
	}

	public void setNhanxet(String nhanxet) {
		this.nhanxet = nhanxet;
	}

	@Column(name = "Ghichu", length = 50)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

}
