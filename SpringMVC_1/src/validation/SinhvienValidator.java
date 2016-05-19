package validation;

import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;

import org.springframework.validation.*;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import entities.Sinhvien;

public class SinhvienValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Sinhvien.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		Sinhvien s = (Sinhvien) arg0;
		if (s.getTen().equalsIgnoreCase("abcdefgh")){
			arg1.rejectValue("ten", "account.username.exists");
		}
	}
	
}
