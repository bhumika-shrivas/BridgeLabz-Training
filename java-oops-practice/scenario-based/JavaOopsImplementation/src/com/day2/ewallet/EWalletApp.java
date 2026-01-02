package com.day2.ewallet;

// Main class
public class EWalletApp 
{
    public static void main(String[] args) {

        User u1 = new User("Aarti", new PersonalWallet(5000));
        User u2 = new User("ShopX", new BusinessWallet(20000, 1000));

        u1.getWallet().transferTo(u2, 1000);

        Transaction.show(u1);
        Transaction.show(u2);
    }
}
