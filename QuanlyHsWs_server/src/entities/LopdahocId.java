package entities;

// Generated Nov 23, 2015 4:06:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LopdahocId generated by hbm2java
 */
@Embeddable
public class LopdahocId implements java.io.Serializable {

	private int maHs;
	private int maLop;

	public LopdahocId() {
	}

	public LopdahocId(int maHs, int maLop) {
		this.maHs = maHs;
		this.maLop = maLop;
	}

	@Column(name = "MaHs", nullable = false)
	public int getMaHs() {
		return this.maHs;
	}

	public void setMaHs(int maHs) {
		this.maHs = maHs;
	}

	@Column(name = "MaLop", nullable = false)
	public int getMaLop() {
		return this.maLop;
	}

	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LopdahocId))
			return false;
		LopdahocId castOther = (LopdahocId) other;

		return (this.getMaHs() == castOther.getMaHs())
				&& (this.getMaLop() == castOther.getMaLop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMaHs();
		result = 37 * result + this.getMaLop();
		return result;
	}

}