package com.cdac.component;

public class HelloWorld {

	public HelloWorld() {
		System.out.println("Constructor of HelloWorld..");
	}
	
	public String sayHello(String name) {
		return "Hello " + name.toUpperCase();
	}
}
