package entities;

public class Lophoc {
	
	private int malop;
	private String tenlop;
	
	
	public int getMalop() {
		return malop;
	}


	public void setMalop(int malop) {
		this.malop = malop;
	}


	public String getTenlop() {
		return tenlop;
	}


	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	
	public Lophoc(int malop, String tenlop) {
		super();
		this.malop = malop;
		this.tenlop = tenlop;
	}

	public Lophoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.tenlop;
//	}

}
