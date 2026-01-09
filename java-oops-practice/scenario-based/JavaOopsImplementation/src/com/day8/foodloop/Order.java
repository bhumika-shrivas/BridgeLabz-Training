package com.day8.foodloop;

import java.util.ArrayList;

class Order implements IOrderable {

    private ArrayList<FoodItem> items = new ArrayList<>();
    private double total;

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock");
        }
    }

    private double applyDiscount() {
        if (total >= 1000) return total * 0.20;
        if (total >= 500) return total * 0.10;
        return 0;
    }

    @Override
    public void placeOrder() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();   // operator usage
        }
        total -= applyDiscount();
        System.out.println("Order placed successfully!");
        System.out.println("Final Bill: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        System.out.println("Order cancelled.");
    }
}
