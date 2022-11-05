package com.simplilearn.config;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Component
@RestControllerAdvice
public class ExceptionHandlerConfig {

	@ExceptionHandler
	public String handleArithmatic(ArithmeticException ex) {
		return "Internal server has occurred, please contact to administrator (From Config)";
	}

	@ExceptionHandler
	public String handleFileNotFound(FileNotFoundException ex) {
		return "Internal server has occurred, please contact to administrator (From Config)";
	}

	@ExceptionHandler
	public String handleException(Exception ex) {
		return "Internal server has occurred, please contact to administrator (From Config)";
	}
}
