package com.functionalinterface.defaultmethods.paymentgateway;

public class UpiPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment processed: " + amount);
    }
}
