package com.functionalinterface.defineandimplement.digitalpayment;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Payment method = null;
		
		System.out.println("Choose your prefered payment method (UPI/Credit Card/ Wallet): ");
		String choice = input.nextLine().toLowerCase();
		
		System.out.println("Enter amount: ");
		double amount = input.nextDouble();
		
		switch (choice) {
		case "upi":
			method = new UPI();
			break;
			
		case "credit card":
			method = new CreditCard();
			break;
			
		case "wallet":
			method = new Wallet();
			break;
			
		default:
			System.out.println("Invalid payment method");
			return;
		}
		
		method.pay(amount);
		input.close();
	}
}
