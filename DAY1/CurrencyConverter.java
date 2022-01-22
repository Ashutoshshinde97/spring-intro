package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("cc") //this replaces <bean id="cc" class="com.cdac.component.CurrencyConverter" />
public class CurrencyConverter {

	public double convert(String from, String to, double amount) {
		if(from.equals("USD") && to.equals("INR"))
			return amount * 74.47;
		else
			return -1; //bad
	}
}
