package com.day3.mybank;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
