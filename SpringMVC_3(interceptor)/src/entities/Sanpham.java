package entities;

public class Sanpham {
	
	private int masp;
	private String tensp;
	private int soluong;
	public int getMasp() {
		return masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public Sanpham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sanpham(int masp, String tensp, int soluong) {
		super();
		this.masp = masp;
		this.tensp = tensp;
		this.soluong = soluong;
	}
}
