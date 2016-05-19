package filter;

import java.util.Base64;
import java.util.StringTokenizer;

import org.eclipse.jdt.internal.compiler.ast.TryStatement;

public class AuthenSvr {
	public boolean authenservice(String authenstring){
		if (authenstring == null)
			return false;
		final String userpassEncoded = authenstring.replaceFirst("Basic" + " ", "");
		System.out.println("==" + userpassEncoded);
		String userandpass = null;
		try {
			byte[] decodebytes = Base64.getDecoder().decode(userpassEncoded);
			userandpass = new String(decodebytes, "UTF-8");
			System.out.println("==" + userandpass);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		final StringTokenizer token = new StringTokenizer(userandpass, ":");
		final String username = token.nextToken();
		System.out.println("==" + username);
		final String password = token.nextToken();
		System.out.println("==" + password);
		
		boolean result = "admin".equals(username) & "admin".equals(password);
		return result;
	}

}
