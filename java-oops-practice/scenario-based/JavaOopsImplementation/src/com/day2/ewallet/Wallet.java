package com.day2.ewallet;

abstract class Wallet implements Transferrable {
    private double balance; // sensitive

    Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
    }

    protected boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
