package com.functionalinterface.markerinterface.dataserialization;

public class BackupApp {
    public static void main(String[] args) {

        UserData user = new UserData("Rashi", "rashi@gmail.com");
        String temp = "Temporary data";

        BackupService.processBackup(user);
        BackupService.processBackup(temp);
    }
}
