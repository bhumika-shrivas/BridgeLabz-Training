package com.day10.payxpress;

public class ElectricityBill extends Bill {
    ElectricityBill(double amt, String date) {
        super("Electricity", amt, date);
    }
    public void pay() {
        markPaid();
        System.out.println("Electricity bill paid");
    }
    public void sendReminder() {
        System.out.println("⚡ Electricity bill due soon!");
    }
}
