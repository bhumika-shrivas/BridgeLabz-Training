package com.reflection.intermediatelevel.accessandmodifyprivatefields;

public class Configuration {

    private static String API_KEY = "OLD_KEY_123";

    public static void showKey() {
        System.out.println("API key is " + API_KEY);
    }
}

