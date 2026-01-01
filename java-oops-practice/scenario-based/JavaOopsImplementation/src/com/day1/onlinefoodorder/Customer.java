package com.day1.onlinefoodorder;

public class Customer {
    String name;
    Cart cart = new Cart();

    public Customer(String name) {
        this.name = name;
    }

    public void orderFood(FoodItem item) {
        cart.addToCart(item);
    }
}
