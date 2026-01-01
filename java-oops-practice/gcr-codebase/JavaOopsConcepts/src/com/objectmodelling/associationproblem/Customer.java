package com.objectmodelling.associationproblem;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // View balance from bank
    public void viewBalance(Bank bank) {
        double balance = bank.getBalance(this);
        System.out.println(name + "'s balance: ₹" + balance);
    }
}
