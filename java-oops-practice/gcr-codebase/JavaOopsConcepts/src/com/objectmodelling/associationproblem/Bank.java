package com.objectmodelling.associationproblem;

import java.util.HashMap;

public class Bank {

    private String bankName;
    private HashMap<Customer, Double> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new HashMap<>();
    }

    // Open account for customer
    public void openAccount(Customer customer, double initialBalance) {
        accounts.put(customer, initialBalance);
        System.out.println("Account opened for " + customer.getName() +
                " in " + bankName + " with balance ₹" + initialBalance);
    }

    // Get balance of a customer
    public double getBalance(Customer customer) {
        return accounts.getOrDefault(customer, 0.0);
    }
}