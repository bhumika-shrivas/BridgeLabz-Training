package com.encapsulation.onlinefoodapp;

abstract class FoodItem {
    private String itemName;
    protected double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    protected int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice(); // Abstraction

    public void getItemDetails() {
        System.out.println(
            itemName +
            " | Qty: " + quantity +
            " | Total: ₹" + calculateTotalPrice()
        );
    }
}
