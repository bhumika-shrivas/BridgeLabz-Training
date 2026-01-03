package com.encapsulation.ecommerceplatform;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 1200));

        calculateFinalPrice(products);
    }

    static void calculateFinalPrice(List<Product> products) {
        for (Product p : products) {
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice = p.price + tax - p.calculateDiscount();
            System.out.println(p.getName() + " → Final Price: ₹" + finalPrice);
        }
    }
}
