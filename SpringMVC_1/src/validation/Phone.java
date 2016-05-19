package validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.internal.xml.ElementType;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

@Documented
@Constraint(validatedBy = PhoneConstraint.class)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

	String message() default "{Phone}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
