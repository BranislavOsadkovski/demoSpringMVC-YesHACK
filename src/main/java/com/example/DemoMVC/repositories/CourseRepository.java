/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DemoMVC.entities.Course;

/**
 * @author Branislav
 *
 */
@Repository
public class CourseRepository {

	/**
	 * @return
	 */
	public List<Course> findAllCourses() {
		
		List<Course> courses = new ArrayList<>() ;
		
		courses.add(new Course(1, "Python"));
		courses.add(new Course(2, "C"));
		courses.add(new Course(3, "Java"));
		courses.add(new Course(4, "Javascript"));
		courses.add(new Course(5, "Ruby"));
		courses.add(new Course(6, "C#"));
		
		return courses;
	}

}
