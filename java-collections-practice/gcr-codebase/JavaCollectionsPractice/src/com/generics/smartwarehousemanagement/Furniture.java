package com.generics.smartwarehousemanagement;

public class Furniture extends WarehouseItem {
	
	private String material;
	
	public Furniture(String name, double price, String material) {
		super(name, price);
//		this.name = name;
//		this.price = price;
		this.material = material;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("ELectronics -> Name: " + name + ", Price: " + price + ", Matetrial: " + material);
	}
}
