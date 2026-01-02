package com.day2.ewallet;

interface Transferrable 
{
    boolean transferTo(User receiver, double amount);
}
