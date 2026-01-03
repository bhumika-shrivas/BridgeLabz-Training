package com.day3.mybank;

class CurrentAccount extends Account {

    CurrentAccount(String accNo) {
        super(accNo);
    }

    public void deposit(double amount) {
        addBalance(amount);
    }

    public void withdraw(double amount) {
        deductBalance(amount);
    }

    double calculateInterest() {
        return 0; // no interest
    }
}
