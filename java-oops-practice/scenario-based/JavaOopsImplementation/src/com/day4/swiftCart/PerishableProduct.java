package com.day4.swiftCart;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price, int quantity) {
        super(name, price, "Perishable", quantity);
    }

    double getDiscount() {
        return getTotalPrice() * 0.10; // 10% discount
    }
}
