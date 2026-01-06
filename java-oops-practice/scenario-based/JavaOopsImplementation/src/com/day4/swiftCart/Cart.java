package com.day4.swiftCart;

class Cart implements ICheckout {
    private Product[] products = new Product[20];
    private int count = 0;
    private double totalPrice = 0;

    Cart() {}

    void addProduct(Product p) {
        products[count++] = p;
    }

    public double generateBill() {
        totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice += products[i].getTotalPrice();
        }
        return totalPrice;
    }

    public double applyDiscount() {
        double discount = 0;
        for (int i = 0; i < count; i++) {
            discount += products[i].getDiscount();
        }
        return totalPrice - discount;
    }

    void displayCart() {
        if (count == 0) {
            System.out.println("Cart is empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(
                products[i].name + " | " +
                products[i].category + " | Qty: " +
                products[i].quantity + " | Price: " +
                products[i].price
            );
        }
    }
}
