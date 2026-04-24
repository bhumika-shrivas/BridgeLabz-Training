package com.functionalinterface.defaultmethods.paymentgateway;

public interface PaymentProcessor {

    void processPayment(double amount);

    // New feature added without breaking old implementations
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed using standard flow");
    }
}
