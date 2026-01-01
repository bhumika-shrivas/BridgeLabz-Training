package com.inheritance.hierarchicalinheritance.bankaccounts;

// main class
public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SB1001", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA2001", 30000, 20000);
        BankAccount acc3 = new FixedDepositAccount("FD3001", 100000, 24);

        acc1.displayAccountType();
        acc1.displayDetails();
        System.out.println();

        acc2.displayAccountType();
        acc2.displayDetails();
        System.out.println();

        acc3.displayAccountType();
        acc3.displayDetails();
    }
}
