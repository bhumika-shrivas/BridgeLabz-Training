package com.day1.onlineshopping;

// Polymorphism 
public class CardPayment implements Payment 
{

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using Credit/Debit Card");
    }
}

