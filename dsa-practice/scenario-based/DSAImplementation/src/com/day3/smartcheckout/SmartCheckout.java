package com.day3.smartcheckout;

import java.util.*;

class SmartCheckout {

    private Queue<Customer> queue = new LinkedList<>();
    private HashMap<String, Double> priceMap = new HashMap<>();
    private HashMap<String, Integer> stockMap = new HashMap<>();

    // Add item to store
    void addItemToStore(String item, double price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    // Add customer to queue
    void addCustomer(Customer c) {
        queue.offer(c);
        System.out.println(c.name + " added to checkout queue");
    }

    // Process billing
    void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        double total = 0;

        for (String item : c.items) {
            if (stockMap.getOrDefault(item, 0) > 0) {
                total += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            } else {
                System.out.println(item + " is out of stock");
            }
        }

        System.out.println("Bill for " + c.name + ": ₹" + total);
    }
}
