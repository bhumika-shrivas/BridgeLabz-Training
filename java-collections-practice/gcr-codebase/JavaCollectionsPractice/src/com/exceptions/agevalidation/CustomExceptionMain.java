package com.exceptions.agevalidation;

import java.util.Scanner;

public class CustomExceptionMain {
		
		public static void validateAge(int age) throws InvalidAgeException{
			
			if(age < 18) {
				throw new InvalidAgeException("Age must be 18 or above");
			}else {
	            System.out.println("Valid age. You are eligible.");
	        }
		}

		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = sc.nextInt();

	            validateAge(age);

	        } catch (InvalidAgeException e) {
	            System.out.println("Age must be 18 or above");

	        } finally {
	            sc.close();
	        }
	    }

}
