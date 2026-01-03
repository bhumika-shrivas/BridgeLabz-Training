package com.encapsulation.ecommerceplatform;

abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    abstract double calculateDiscount(); // Abstraction
}
