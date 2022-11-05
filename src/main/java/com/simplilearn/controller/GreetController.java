package com.simplilearn.controller;

import java.lang.invoke.MethodType;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Greet;

@RestController
// @RestController = @Controller + @ResponseBody(On each method)
public class GreetController {

	//@GetMapping("/greets")
	
	@RequestMapping(value="/greets", method=RequestMethod.GET)
	public Greet greetMe() {
		Greet greet = new Greet();
		greet.setName("Dhruvik");
		greet.setMessage("Hello Simplilearn!");
		return greet;
	}

}
