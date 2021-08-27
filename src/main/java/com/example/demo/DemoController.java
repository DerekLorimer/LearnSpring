package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	SayFoo sayFoo;
	
	@GetMapping("/")
	public String index() {
		
		System.out.println(sayFoo.foo());
		return "Returning text!" + sayFoo.foo();
	}
	
	@GetMapping("/test")
	public String index2() {
		return "Returning text from test!";
	}

}
