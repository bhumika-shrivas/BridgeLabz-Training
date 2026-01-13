package com.day9.gamebox;

abstract class Game implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    protected double rating;

    Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Operator usage (seasonal discount)
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);   // operators
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully");
    }
}
