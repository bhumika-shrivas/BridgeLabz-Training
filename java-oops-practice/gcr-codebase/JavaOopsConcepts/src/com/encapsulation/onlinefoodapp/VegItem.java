package com.encapsulation.onlinefoodapp;

class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        return price * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    public String getDiscountDetails() {
        return "Veg Discount: 10%";
    }
}
