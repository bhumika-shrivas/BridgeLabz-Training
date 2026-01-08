package com.day6.bookbazar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;   // 🔒 inventory protected

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this(title, author, price, stock, false);
    }

    // Constructor with optional offer
    public Book(String title, String author, double price, int stock, boolean offer) {
        this.title = title;
        this.author = author;
        this.price = offer ? price * 0.9 : price; // 10% offer
        this.stock = stock;
    }

    // Encapsulation: stock update only via methods
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
