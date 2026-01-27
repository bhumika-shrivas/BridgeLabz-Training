package com.generics.onlinemarketplace;

public class Product<T extends Category> {

    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        if (price < category.getMinPrice() || price > category.getMaxPrice()) {
            throw new IllegalArgumentException(
                "Price must be between " + category.getMinPrice() + " and " + category.getMaxPrice()
            );
        }
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return "Product: " + name +
               ", Category: " + category.getCategoryName() +
               ", Price: ₹" + price;
    }
}
