package com.functionalinterface;

/*Temperature Alert System
○ Scenario: Alert if temperature crosses threshold.
○ Task: Use Predicate<Double> functional interface.*/

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temperature: ");
		double temp = input.nextDouble();
		
		// Predicate to check temperature threshold
		Predicate<Double> isHighTemp = t -> t>40;
		
		if (isHighTemp.test(temp)) {
			System.out.println("Alert! High temperature");
		} else {
			System.out.println("Temperature is normal");
		}
		input.close();
	}
}
