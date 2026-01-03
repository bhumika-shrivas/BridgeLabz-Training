package com.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return 0; // No interest
    }
}
