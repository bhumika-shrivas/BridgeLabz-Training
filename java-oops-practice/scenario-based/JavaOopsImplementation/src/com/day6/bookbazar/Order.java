package com.day6.bookbazar;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private String userName;
    private final Map<Book, Integer> items = new HashMap<>();

    private String status = "CREATED"; // 🔒 controlled internally

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println("Insufficient stock for " + book.getTitle());
        }
    }

    // price × quantity – discount
    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double cost = book.getPrice() * qty;
            double discount = book.applyDiscount(qty);
            total += (cost - discount);
        }
        return total;
    }

    // status update restricted
    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void showOrderSummary() {
        System.out.println("\nOrder for: " + userName);
        for (Book book : items.keySet()) {
            System.out.println(
                book.getTitle() + " x " + items.get(book)
            );
        }
        System.out.println("Order Status: " + status);
        System.out.println("Total Amount: " + calculateTotal());
    }
}