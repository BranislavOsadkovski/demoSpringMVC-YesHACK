/**
 * Copyright the original author or authors.
 */
package com.example.DemoMVC.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Branislav
 *
 */
@RestController
@RequestMapping("rest")
public class NewRestEndpoint {

	@GetMapping
	public String checkEnd() {
		return "rest-test";
	}
}
