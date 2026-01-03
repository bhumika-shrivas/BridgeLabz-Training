package com.day3.mybank;

class SavingsAccount extends Account {
    private final double interestRate = 4.0;

    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    public void deposit(double amount) {
        addBalance(amount);
    }

    public void withdraw(double amount) {
        deductBalance(amount);
    }

    double calculateInterest() {
        return checkBalance() * interestRate / 100;
    }
}
