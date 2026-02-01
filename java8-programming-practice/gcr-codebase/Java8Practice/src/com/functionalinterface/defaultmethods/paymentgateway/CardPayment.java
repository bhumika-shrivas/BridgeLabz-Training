package com.functionalinterface.defaultmethods.paymentgateway;

public class CardPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Card payment processed: " + amount);
    }
}
