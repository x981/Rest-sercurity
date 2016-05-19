package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraint implements ConstraintValidator<Phone, String>{

	@Override
	public void initialize(Phone String) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if (arg0 == null) {
			return false;
		}
		return arg0.matches("[0-9()-]*");
	}

}
