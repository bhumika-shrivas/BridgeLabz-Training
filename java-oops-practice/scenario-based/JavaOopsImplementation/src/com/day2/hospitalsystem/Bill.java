package com.day2.hospitalsystem;

// Operator + Billing logic
class Bill implements Payable {
    private double amount;
    private double tax = 0.05;
    private double discount = 0.10;

    Bill(double amount) {
        this.amount = amount;
    }

    public double calculatePayment() {
        return amount + (amount * tax) - (amount * discount);
    }
}
