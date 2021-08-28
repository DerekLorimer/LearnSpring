package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FooServiceTest {
	
	@Autowired
	FooService service;

	@Test
	void test() {
		assertEquals("foo",service.sayFoo());
	}

}
