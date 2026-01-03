package com.encapsulation.ecommerceplatform;

class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}
