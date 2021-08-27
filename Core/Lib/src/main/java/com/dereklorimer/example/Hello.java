package com.dereklorimer.example;

import org.apache.log4j.Logger;

public class Hello {
	
	final static Logger logger = Logger.getLogger(Hello.class);
	
	private static int VERSION = 6;
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		logger.debug("Hello World!");

	}

	public void HelloWorld() {
		
		logger.debug("Version " + VERSION);

	}

}
