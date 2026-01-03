package com.encapsulation.bankingsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Amit", 80000));
        accounts.add(new CurrentAccount("CA201", "Neha", 120000));

        for (BankAccount acc : accounts) {
            System.out.println(
                "Balance: ₹" + acc.getBalance() +
                " | Interest: ₹" + acc.calculateInterest()
            );
        }
    }
}
