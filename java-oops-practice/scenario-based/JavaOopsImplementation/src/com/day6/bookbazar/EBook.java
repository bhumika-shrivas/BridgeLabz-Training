package com.day6.bookbazar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock, boolean offer) {
        super(title, author, price, stock, offer);
    }

    // Polymorphic discount logic
    @Override
    public double applyDiscount(int quantity) {
        // Flat 15% discount for ebooks
        return price * quantity * 0.15;
    }
}