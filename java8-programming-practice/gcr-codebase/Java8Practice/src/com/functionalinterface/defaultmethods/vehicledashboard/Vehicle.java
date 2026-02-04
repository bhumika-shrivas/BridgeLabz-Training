package com.functionalinterface.defaultmethods.vehicledashboard;

public interface Vehicle {
	void displaySpeed();
	
	default void displayBatterPrecentage() {
		System.out.println("Battery percentage not applicable");
	}

}
