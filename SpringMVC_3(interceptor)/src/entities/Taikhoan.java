package entities;

public class Taikhoan {
	
	private int id;
	private String ten;
	private String pass;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Taikhoan(int id, String ten, String pass) {
		super();
		this.id = id;
		this.ten = ten;
		this.pass = pass;
	}
	public Taikhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
