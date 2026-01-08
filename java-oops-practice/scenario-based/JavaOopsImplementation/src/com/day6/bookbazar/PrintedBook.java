package com.day6.bookbazar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock, boolean offer) {
        super(title, author, price, stock, offer);
    }

    // Polymorphic discount logic
    @Override
    public double applyDiscount(int quantity) {
        // Discount only if bulk purchase
        if (quantity >= 3) {
            return price * quantity * 0.10;
        }
        return 0;
    }
}