package com.functionalinterface.defineandimplement.vehiclerental;

public class Bus implements RentalSystem {
	
	@Override
	public void rent() {
		System.out.println("Bus is rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bus is returned");
	}
}
