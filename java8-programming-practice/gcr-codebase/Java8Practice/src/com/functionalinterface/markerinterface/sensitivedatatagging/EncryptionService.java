package com.functionalinterface.markerinterface.sensitivedatatagging;

public class EncryptionService {

    static void encryptIfSensitive(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption needed");
        }
    }
}