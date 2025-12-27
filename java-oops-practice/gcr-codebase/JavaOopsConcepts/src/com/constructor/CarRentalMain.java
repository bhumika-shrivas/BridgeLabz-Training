package com.constructor.level1;
import java.util.Scanner;

public class CarRentalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Car Model : ");
		String carModel = sc.nextLine();
		
		System.out.println("Enter Rental days : ");
		int days = sc.nextInt();
		
		System.out.println("Enter Price per day : ");
		double pricePerDay = sc.nextDouble();
		
		CarRental obj = new CarRental(name,carModel,days,pricePerDay);
		obj.displayDetails();
		
	}

}
