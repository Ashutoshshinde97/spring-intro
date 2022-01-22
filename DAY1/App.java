package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Calculator;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.LoginService;
import com.cdac.component.TextEditor;

public class App {

	public static void main(String[] args) {
		//Loading IoC container
		//We are loading Spring framework in the memory now
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		//Accessing any Bean/Object
		//Why are we not creating the Object? HelloWorld h = new HelloWorld();
		//Why are we using Spring for creating the HelloWorld object?
		//Spring will create only one object of any bean/class. This technique is called as singleton pattern
		for(int i=0; i<5; i++) {
			HelloWorld h = (HelloWorld) ctx.getBean("hw");
			System.out.println(h.sayHello("Majrul"));
		}
		
		Calculator c = (Calculator) ctx.getBean("calc");
		System.out.println(c.add(10, 20));
		
		CurrencyConverter currConv = (CurrencyConverter) ctx.getBean("cc");
		System.out.println(currConv.convert("USD", "INR", 75));
		
		LoginService loginServ = (LoginService) ctx.getBean("login");
		System.out.println(loginServ.isValidUser("majrul", "123"));

		TextEditor te = (TextEditor) ctx.getBean("txtEdtr");
		te.loadDocument("abc.txt");
	}
}
