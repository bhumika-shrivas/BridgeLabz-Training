package com.day3.mybank;

public class MyBankApp {
    public static void main(String[] args) {

        Account a1 = new SavingsAccount("SB101", 10000);
        Account a2 = new CurrentAccount("CA202");

        a1.deposit(2000);
        a2.deposit(5000);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Balance: " + a2.checkBalance());
    }
}
