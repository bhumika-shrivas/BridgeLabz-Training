package com.functionalinterface.defaultmethods.paymentgateway;

public class WalletPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Wallet payment processed: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Wallet refund processed instantly: " + amount);
    }
}
