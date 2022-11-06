package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandlingController {

	/*
	 * @ExceptionHandler public String handleArithmatic(ArithmeticException ex) {
	 * return "Internal server has occurred, please contact to administrator"; }
	 */

	@GetMapping("/calculate")
	public int calculate() {
		int a = 6;
		int b = 0;
		//int res = a / b;
		
		throw new NullPointerException();
	}
}
