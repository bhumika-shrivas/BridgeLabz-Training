package com.generics.smartwarehousemanagement;

public class Groceries extends WarehouseItem {
	
	private int expiryDate;
	
	public Groceries(String name, double price, int expiryDate) {
		super(name, price);
		this.expiryDate = expiryDate;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("ELectronics -> Name: " + name + ", Price: " + price + ", Expiry: " + expiryDate);
	}
}
