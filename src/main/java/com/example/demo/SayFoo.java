package com.example.demo;

import org.springframework.stereotype.Component;

@Component("SayFoo")
public class SayFoo {
	
	public String foo() {
		return "foo";
	}

}
