package com.day10.payxpress;

public class InternetBill extends Bill {
    InternetBill(double amt, String date) {
        super("Internet", amt, date);
    }
    public void pay() {
        markPaid();
        System.out.println("Internet bill paid");
    }
    public void sendReminder() {
        System.out.println("🌐 Internet bill due!");
    }
}
