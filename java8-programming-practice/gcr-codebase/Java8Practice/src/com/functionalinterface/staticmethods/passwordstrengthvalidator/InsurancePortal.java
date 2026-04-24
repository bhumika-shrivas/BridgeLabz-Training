package com.functionalinterface.staticmethods.passwordstrengthvalidator;
/*Password Strength Validator
○ Scenario: In an insurance portal, password policy rules are centrally defined.
○ Task: Create a static method in an interface SecurityUtils to check password
strength.*/

import java.util.Scanner;

public class InsurancePortal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		if (SecurityUtils.isStrongPassword(password)) {
			System.out.println("Password is strong");
		} else {
			System.out.println("Password is weak");
		}
		sc.close();
	}
}
