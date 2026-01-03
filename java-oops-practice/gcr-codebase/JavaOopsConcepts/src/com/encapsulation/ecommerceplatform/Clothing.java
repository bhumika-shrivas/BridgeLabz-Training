package com.encapsulation.ecommerceplatform;

class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    public double calculateTax() {
        return price * 0.05; // 5% GST
    }

    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}
