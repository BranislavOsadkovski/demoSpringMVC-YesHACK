/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.controllers;

import java.util.Set;
 
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.DemoMVC.entities.User;
import com.example.DemoMVC.services.CourseService; 

/**
 * @author Branislav
 *
 */
@Controller
@RequestMapping("view")
@SessionAttributes("user")
public class CourseController {

	private final CourseService courseService;
	private final Validator validator;
	
	
	@Autowired
	public CourseController(CourseService courseService, Validator validator) {
		super();
		this.validator=validator;
		this.courseService = courseService;
	}



	@RequestMapping(method = RequestMethod.GET,path = "courses")
	public String getCoursesView(Model model) {
		
		model.addAttribute("courses", courseService.getCourses());
		model.addAttribute("user", new User());
		return "courses";
	}
	
	@RequestMapping(method = RequestMethod.POST,path = "enlist")
	public String enlistUser(@ModelAttribute User user, BindingResult result,SessionStatus status) {
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		for(ConstraintViolation<User> violation : violations) {
			String propertyPath = violation.getPropertyPath().toString();
			String message = violation.getMessage();
			
			result.addError(new FieldError("user",propertyPath,
					  "Invalid "+ propertyPath + "(" + message + ")"));
		}
		
		if(result.hasErrors()) {
			return "courses";
		}
		
		//user save into db
		//repository.save();
		
		
		//Mark session complete
		status.setComplete();
		return "redirect:enlist/success";
	}
 	
	 @RequestMapping(value = "/enlist/success", method = RequestMethod.GET)
	    public String success(Model model) {
	        return "fuck yea";
	    }
}
