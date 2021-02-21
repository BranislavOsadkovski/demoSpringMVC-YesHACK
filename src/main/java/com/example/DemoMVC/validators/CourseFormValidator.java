/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.example.DemoMVC.entities.User;
/**
 * @author Branislav
 *
 */
@Component
public class CourseFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
	
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "error.firstname","First name is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "error.lastname","Last name is required");
	}

}
