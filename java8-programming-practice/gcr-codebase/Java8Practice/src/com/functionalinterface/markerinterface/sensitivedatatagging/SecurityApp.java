package com.functionalinterface.markerinterface.sensitivedatatagging;

public class SecurityApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789", 50000);
        String name = "Public Data";

        EncryptionService.encryptIfSensitive(account);
        EncryptionService.encryptIfSensitive(name);
    }
}