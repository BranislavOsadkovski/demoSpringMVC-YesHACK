/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoMVC.entities.Course;
import com.example.DemoMVC.repositories.CourseRepository;

/**
 * @author Branislav
 *
 */
@Service
public class CourseService {

	
	private final CourseRepository courseRepository;
	
	
	
	@Autowired
	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}


	
	public List<Course> getCourses() {
		
		return courseRepository.findAllCourses();
	}

}
