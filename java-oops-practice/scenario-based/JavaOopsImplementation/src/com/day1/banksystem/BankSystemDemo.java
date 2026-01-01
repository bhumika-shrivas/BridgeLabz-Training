package com.day1.banksystem;

// Main Class
public class BankSystemDemo 
{
    public static void main(String[] args) 
    {

        Bank bank = new Bank("National Bank");
        bank.welcome();

        SavingsAccount savings = new SavingsAccount("SB101", 10000, 4.0);
        Customer customer1 = new Customer("Rohan", savings);

        customer1.deposit(5000);
        customer1.withdraw(2000);
        savings.calculateInterest();
        customer1.showBalance();

        System.out.println("\n----------------------");

        CurrentAccount current = new CurrentAccount("CA201", 15000);
        Customer customer2 = new Customer("Neha", current);

        customer2.withdraw(3000);
        customer2.showBalance();
    }
}
