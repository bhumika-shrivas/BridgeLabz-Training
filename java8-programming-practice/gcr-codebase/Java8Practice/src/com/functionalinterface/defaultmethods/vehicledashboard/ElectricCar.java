package com.functionalinterface.defaultmethods.vehicledashboard;

public class ElectricCar implements Vehicle{
	@Override
	public void displaySpeed() {
		System.out.println("Electric Car speed: 90 km/h");
	}
	
	@Override
	public void displayBatterPrecentage() {
		System.out.println("Electric Car battery percentage: 75%");
	}

}
