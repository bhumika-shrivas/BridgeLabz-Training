package com.objectmodelling.associationandaggregationproblem2;

public class Product {

    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println(productName + " - ₹" + price);
    }
}
