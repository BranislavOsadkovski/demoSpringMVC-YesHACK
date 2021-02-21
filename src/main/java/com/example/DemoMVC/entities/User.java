/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.entities;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Branislav
 *
 */
public class User {
	@Size(min = 3, max = 20, message = "Invalid Name")	
	private String firstname;

	@Size(min = 3, max = 20)
	private String lastname;

	@Pattern(regexp = ".+@.+\\.[a-z]+")
	private String email;

	/**
	 * @param firstname
	 * @param lastname  must not be null
	 */
	public User(String firstname, String lastname,String email) {
		this.email=email;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	/**
	 * must not be null
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
