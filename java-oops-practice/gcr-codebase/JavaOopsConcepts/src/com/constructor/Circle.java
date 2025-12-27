package com.constructor.level1;

public class Circle {

	double radius; 
	
	public Circle() {
        this(1.0);   // calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
    }
}
