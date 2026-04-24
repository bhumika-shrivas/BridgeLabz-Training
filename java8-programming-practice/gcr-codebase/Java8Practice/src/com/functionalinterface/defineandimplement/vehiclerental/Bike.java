package com.functionalinterface.defineandimplement.vehiclerental;

public class Bike implements RentalSystem{
	
	@Override
	public void rent() {
		System.out.println("Bike is rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bike is returned");
	}
}
