/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.entities;

/**
 * @author Branislav
 *
 */
public class Course {

	
	/**
	 * @param courseId
	 * @param courseName must not be null
	 */
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	private int courseId;
	private String courseName;
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
