package com.functionalinterface.defineandimplement.digitalpayment;

public class Wallet implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("Payment by Wallet successful of ₹" + amount);
	}

}
