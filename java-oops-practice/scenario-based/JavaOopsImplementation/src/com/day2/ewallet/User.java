package com.day2.ewallet;

class User 
{
    private String name;
    private Wallet wallet;

    User(String name, Wallet wallet) 
    {
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() 
    {
        return wallet;
    }

    public String getName() 
    {
        return name;
    }
}
