package com.day1.onlineshopping;

// Inheritance
public class PhysicalProduct extends Product {

    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight + " kg");
    }
}
