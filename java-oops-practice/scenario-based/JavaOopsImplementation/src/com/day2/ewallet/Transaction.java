package com.day2.ewallet;

class Transaction 
{
    static void show(User user) 
    {
        System.out.println(user.getName() + " Balance: " +
                user.getWallet().getBalance());
    }
}
