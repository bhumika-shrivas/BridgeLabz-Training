package com.functionalinterface.defineandimplement.vehiclerental;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RentalSystem vehicle = null;
		
		System.out.println("Choose vehicle to rent \n1. Car \n2. Bike \n3. Bus");
		String choice = sc.nextLine().toLowerCase();
		
		System.out.println("DO you want to rent or return");
		
		switch (choice) {
		case "car":
			vehicle = new Car();
			break;
			
		case "bike":
			vehicle = new Bike();
			break;
			
		case "bus":
			vehicle = new Bus();
			break;
		default:
			System.out.println("Invalid vehicle choice");
			return;
		}
		
		System.out.println("Chooce action: rent / return");
		String action = sc.nextLine().toLowerCase();
		
		if (action.equals("rent")) {
			vehicle.rent();
		} else if (action.equals("return")) {
			vehicle.returnVehicle();
		} else {
			System.out.println("Invalid action");
		}
		sc.close();
	}
}
