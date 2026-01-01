package com.objectmodelling.associationproblem;

public class AssociationDemo {
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer bhumika = new Customer("Bhumika");
        Customer arya = new Customer("Arya");

        // Association: customers linked with banks
        sbi.openAccount(bhumika, 5000);
        hdfc.openAccount(bhumika, 12000);
        sbi.openAccount(arya, 8000);

        // Customers interacting with banks
        bhumika.viewBalance(sbi);
        bhumika.viewBalance(hdfc);
        arya.viewBalance(sbi);
    }
}
