package com.day1.onlineshopping;

//Inheritance
public class DigitalProduct extends Product {

    private String downloadLink;

    public DigitalProduct(int id, String name, double price, String downloadLink) {
        super(id, name, price);
        this.downloadLink = downloadLink;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Download Link: " + downloadLink);
    }
}
