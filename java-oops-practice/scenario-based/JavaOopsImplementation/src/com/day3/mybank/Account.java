package com.day3.mybank;

abstract class Account implements ITransaction {
    protected String accountNumber;
    private double balance; // sensitive

    Account(String accNo) {
        this.accountNumber = accNo;
    }

    Account(String accNo, double openingBalance) {
        this.accountNumber = accNo;
        this.balance = openingBalance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }

    abstract double calculateInterest();
}
