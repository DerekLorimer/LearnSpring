package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {
	
	@Autowired
	private SayFoo sayFoo;
	
	public void doSomething() {
		
		System.out.println(sayFoo.foo());
		
	}

}
