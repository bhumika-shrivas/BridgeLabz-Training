package com.functionalinterface.defineandimplement.vehiclerental;

public class Car implements RentalSystem {
	
	@Override
	public void rent() {
		System.out.println("Car is rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Car is returned");
	}
}
