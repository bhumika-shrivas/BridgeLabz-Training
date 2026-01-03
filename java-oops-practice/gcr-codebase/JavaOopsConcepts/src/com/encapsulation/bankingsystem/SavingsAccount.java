package com.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied: ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance >= 50000;
    }
}
