package com.lambdaexpression.ecommerce;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private double rating;
	private double discount;
	
	public Product(int id, String name, double price, double rating, double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getRating() {
		return rating;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	@Override
	public String toString() {
		return name + 
				" | Price: " + price +
				" | Rating: " + rating +
				" | Discount: " + discount + "%";
	}
}
