package com.constructor.level1;

public class Product {

	String productName;
	double price;
	static int totalProducts = 0;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;   // increase count whenever object is created
	}
	
	public void displayProductDetails() {

		System.out.println("Product name : "+productName);
		System.out.println("Product price : "+price);
	}
	
	public static void displayTotalProducts() {
		System.out.println("Total numbeer of products created : "+totalProducts);
	}
}
