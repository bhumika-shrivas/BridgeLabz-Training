package com.day1.banksystem;

public class Customer {

    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(double amount) {
        System.out.println("\n" + name + " depositing money");
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        System.out.println("\n" + name + " withdrawing money");
        account.withdraw(amount);
    }

    public void showBalance() {
        account.displayBalance();
    }
}
