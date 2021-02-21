/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.DemoMVC.services.CourseService;

/**
 * @author Branislav
 *
 */
@Controller
@RequestMapping("view")
public class CourseController {

	private final CourseService courseService;
	
	
	
	@Autowired
	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}



	@RequestMapping(method = RequestMethod.GET,path = "courses")
	public String getCoursesView(Model model) {
		
		model.addAttribute("courses", courseService.getCourses());
		
		return "courses";
	}
	
	
}
