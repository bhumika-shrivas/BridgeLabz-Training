package com.day10.payxpress;

abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private String dueDate;
    private boolean isPaid;

    Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected void markPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    // late fee operator usage
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    public String getType() {
        return type;
    }
}
