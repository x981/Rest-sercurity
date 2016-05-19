package entities;

public class Number {
	
	private int ma;
	private String so;
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	
	public Number(int ma, String so) {
		super();
		this.ma = ma;
		this.so = so;
	}
	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}
}
