package com.functionalinterface.staticmethods.unitconversiontool;
/*Unit Conversion Tool
○ Scenario: Logistics software needs standard unit conversions (km to miles, kg to
lbs).
○ Task: Implement conversions as static interface methods.*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose conversion: ");
		System.out.println("1. Km to Miles");
	    System.out.println("2. Kg to Lbs");
	    System.out.print("Enter choice: ");

	    int choice = sc.nextInt();
	    System.out.print("Enter value: ");
	    double value = sc.nextDouble();
	    
	    switch (choice) {
        case 1:
            System.out.println("Result: " + UnitConverter.kmToMiles(value) + " Miles");
            break;
        case 2:
            System.out.println("Result: " + UnitConverter.kgToLbs(value) + " Lbs");
            break;
        default:
            System.out.println("Invalid choice");
    }

	}

}
