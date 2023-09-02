package com.lordwillfer.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lordwillfer.rest.webservices.restfulwebservices.bean.HelloWorldBean;

// Controller
@RestController
public class HelloWorldController {

	// GET
	// URI - /hello-world
	// Method - "Hello World"
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Wolrd");
	}
}
