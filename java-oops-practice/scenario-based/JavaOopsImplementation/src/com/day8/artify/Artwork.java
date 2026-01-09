package com.day8.artify;

abstract class Artwork implements IPurchasable {
    String title;
    String artist;
    double price;
    String preview;
    String licenseType;
    protected String licensingTerms;   // encapsulated

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, String preview) {
        this(title, artist, price, licenseType);
        this.preview = preview;
    }

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.preview = "default_preview.png";
        this.licensingTerms = "Standard Artify Terms";
    }

    public String getLicensingTerms() {
        return licensingTerms;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price); // operator usage
            System.out.println(user.getName() + " purchased " + title);
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }

    @Override
    public abstract void license();
}
