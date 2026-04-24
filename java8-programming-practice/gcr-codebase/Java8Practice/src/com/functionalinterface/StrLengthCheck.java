package com.functionalinterface;

/*String Length Checker
○ Scenario: Check if a message exceeds character limit.
○ Task: Use Function<String, Integer>.*/

import java.util.Scanner;
import java.util.function.Function;

public class StrLengthCheck {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Set the threshold: ");
		int limit = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the message");
		String msg = input.nextLine();
		
		// Function to check string length
		Function<String, Integer> getLength = str -> str.length();
		
		if (getLength.apply(msg)>limit) {
			System.out.println("Message exceed the character limit");
		} else {
			System.out.println("Message is within the limiut");
		}
		input.close();
	}
}
