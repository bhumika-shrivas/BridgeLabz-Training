package com.day1.onlinefoodorder;

import java.util.ArrayList;

public class Cart {
    ArrayList<FoodItem> items = new ArrayList<>();

    public void addToCart(FoodItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }
        return total;
    }
}
