package com.functionalinterface.defineandimplement.digitalpayment;

public class CreditCard implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("Payment by Credit Card successful of ₹" + amount);
	}

}
