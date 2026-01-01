package com.inheritance.hierarchicalinheritance.bankaccounts;

// Subclass
public class FixedDepositAccount extends BankAccount {

    private int tenureMonths;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
