package com.encapsulation.onlinefoodapp;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Burger", 120, 2));
        order.add(new NonVegItem("Chicken Wrap", 180, 1));

        processOrder(order);
    }

    static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(
                    d.getDiscountDetails() +
                    " | Discount: ₹" + d.applyDiscount()
                );
            }
            System.out.println();
        }
    }
}
