package com.functionalinterface.markerinterface.dataserialization;

public class BackupService {

    static void processBackup(Object obj) {
        if (obj instanceof Backupable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Object not eligible for backup");
        }
    }
}