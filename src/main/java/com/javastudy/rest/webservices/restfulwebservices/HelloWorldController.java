package com.javastudy.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method= RequestMethod.GET, path="/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
}