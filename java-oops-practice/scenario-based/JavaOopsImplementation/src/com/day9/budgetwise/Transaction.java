package com.day9.budgetwise;

class Transaction {

    private double amount;
    private String type;      // income / expense
    private String date;
    private String category;

    Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }
}
