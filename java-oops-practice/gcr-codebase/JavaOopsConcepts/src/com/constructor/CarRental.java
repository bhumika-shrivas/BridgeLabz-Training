package com.constructor.level1;

public class CarRental {

	String customerName;
	String carModel;
	int rentalDays;
	double pricePerDay;
	double totalCost;
	
	public CarRental(String customerName,String carModel,int rentalDays, double pricePerDay) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.pricePerDay = pricePerDay;
		
		totalCost = rentalDays * pricePerDay;
	}
	
	public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

}
