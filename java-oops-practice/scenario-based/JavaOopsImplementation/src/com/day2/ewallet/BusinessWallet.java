package com.day2.ewallet;

class BusinessWallet extends Wallet 
{
    BusinessWallet(double balance, double referralBonus) 
    {
        super(balance, referralBonus);
    }

    public boolean transferTo(User receiver, double amount) 
    {
        if (amount > 50000) return false; // business limit

        if (debit(amount)) 
        {
            receiver.getWallet().credit(amount);
            return true;
        }
        return false;
    }
}
