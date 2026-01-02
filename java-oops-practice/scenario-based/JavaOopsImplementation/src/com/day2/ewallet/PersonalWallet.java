package com.day2.ewallet;

class PersonalWallet extends Wallet 
{

    PersonalWallet(double balance) 
    {
        super(balance);
    }

    public boolean transferTo(User receiver, double amount) 
    {
        double tax = amount * 0.02; // 2% tax
        double total = amount + tax;

        if (debit(total)) 
        {
            receiver.getWallet().credit(amount);
            return true;
        }
        return false;
    }
}
