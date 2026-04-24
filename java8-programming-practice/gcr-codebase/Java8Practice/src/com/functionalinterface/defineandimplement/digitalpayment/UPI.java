package com.functionalinterface.defineandimplement.digitalpayment;

public class UPI implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("Payment by UPI successful of ₹" + amount);
	}

}
