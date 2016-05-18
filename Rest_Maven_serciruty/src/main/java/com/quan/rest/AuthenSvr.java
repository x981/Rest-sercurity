package com.quan.rest;

import java.util.Base64;
import java.util.StringTokenizer;

public class AuthenSvr {
	public boolean authenservice(String authenstring){
		if (authenstring == null)
			return false;
		final String userpassEncoded = authenstring.replaceFirst("Basic" + " ", "");
		String userandpass = null;
		try {
			byte[] decodebytes = Base64.getDecoder().decode(userpassEncoded);
			userandpass = new String(decodebytes, "UTF-8");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		final StringTokenizer token = new StringTokenizer(userandpass, ":");
		final String username = token.nextToken();
		final String password = token.nextToken();
		
		boolean result = "admin".equals(username) & "admin".equals(password);
		return result;
	}

}
