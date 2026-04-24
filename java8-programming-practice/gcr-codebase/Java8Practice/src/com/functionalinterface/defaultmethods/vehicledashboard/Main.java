package com.functionalinterface.defaultmethods.vehicledashboard;

public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle electricCar = new ElectricCar();
		
		car.displaySpeed();
		car.displayBatterPrecentage();
		
		electricCar.displaySpeed();
		electricCar.displayBatterPrecentage();
	}

}
