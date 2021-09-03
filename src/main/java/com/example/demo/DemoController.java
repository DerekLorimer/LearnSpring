package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	final static Logger logger = LoggerFactory.getLogger(DemoController.class);

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

	@GetMapping(path = "/hello")
	public String sayHello() {
		// Get data from service layer into entityList.
		logger.info("Get data from service layer into entityList");
		

		List<JSONObject> entities = new ArrayList<JSONObject>();
		JSONObject entity = new JSONObject();
		entity.put("aa", "bb");
		entities.add(entity);

		return entities.toString();
	}

}
