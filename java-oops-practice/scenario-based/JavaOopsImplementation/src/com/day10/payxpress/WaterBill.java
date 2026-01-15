package com.day10.payxpress;

public class WaterBill extends Bill {
    WaterBill(double amt, String date) {
        super("Water", amt, date);
    }
    public void pay() {
        markPaid();
        System.out.println("Water bill paid");
    }
    public void sendReminder() {
        System.out.println("💧 Water bill reminder sent");
    }
}
