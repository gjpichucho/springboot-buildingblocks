package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	//simple method
	//URI - /helloWorld
	//GET 
	//@RequestMapping(method =RequestMethod.GET,path = "/helloworld")
	@GetMapping ("/helloworld1")
	public String helloWorld() {
		return "Hello everyonee1";
	}
	//
	@GetMapping ("/helloworld-bean")
	public UserDeatils helloWorldBean() {
		return new UserDeatils("Galo", "Pichucho", "Quito");
	}
}
