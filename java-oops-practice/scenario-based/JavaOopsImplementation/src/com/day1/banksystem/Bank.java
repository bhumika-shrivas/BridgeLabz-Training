package com.day1.banksystem;

public class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void welcome() {
        System.out.println("Welcome to " + bankName);
    }
}
