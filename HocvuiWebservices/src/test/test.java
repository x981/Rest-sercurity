package test;

import entities.Nguoichoi;
import model.UserModel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserModel um = new UserModel();
		String email = "aff0511@gmail.com";
		String pass = "123456";
		Nguoichoi u = um.find(email, pass);
		
		if (u==null){
			System.out.println("Ko thay");
		} else {
			System.out.println("Thay");
		}

	}

}
