package com.day9.budgetwise;

import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected HashMap<String, Double> categoryLimits;
    protected ArrayList<Transaction> transactions;

    Budget(double income, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Controlled expense addition
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Operator usage
    public double calculateNetSavings() {
        double expenses = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                expenses += t.getAmount();
            }
        }
        return income - expenses; // operator -
    }
}
