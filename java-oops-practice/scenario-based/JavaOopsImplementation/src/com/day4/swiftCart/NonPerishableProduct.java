package com.day4.swiftCart;

class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, "Non-Perishable", quantity);
    }

    double getDiscount() {
        return getTotalPrice() * 0.05; // 5% discount
    }
}
