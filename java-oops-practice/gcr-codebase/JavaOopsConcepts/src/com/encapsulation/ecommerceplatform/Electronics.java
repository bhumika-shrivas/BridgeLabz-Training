package com.encapsulation.ecommerceplatform;

class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    public double calculateTax() {
        return price * 0.18; // 18% GST
    }

    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}
