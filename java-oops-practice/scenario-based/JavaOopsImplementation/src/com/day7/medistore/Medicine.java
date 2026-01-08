package com.day7.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected LocalDate expiryDate;

    private double price;     // 🔒 sensitive pricing logic hidden
    private int quantity;     // 🔒 internal stock

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulation: stock adjustment only through method
    protected boolean reduceStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    protected double calculateCost(int qty) {
        double total = price * qty;
        if (qty >= 10) {
            total -= total * 0.05; // 5% bulk discount
        }
        return total;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
