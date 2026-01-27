package com.generics.smartwarehousemanagement;

// Parent class of all warehouse items
public abstract class WarehouseItem {
	protected String name;
	protected double price;
	
	public WarehouseItem(String name, double price) {
		this.name= name;
		this.price = price;
		}
	
	// Every item must define how it displays itself
	public abstract void displayInfo();
}
