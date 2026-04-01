package com.reflection.intermediatelevel.accessandmodifyprivatefields;

import java.lang.reflect.Field;

public class StaticFieldModify {

    public static void main(String[] args) {

        try {
            Class<?> cls = Configuration.class;

            // Access private static field
            Field field = cls.getDeclaredField("API_KEY");

            // Allow access
            field.setAccessible(true);

            // Modify static field, no object needed so null is used
            field.set(null, "NEW_KEY_999");

            // Print modified value
            Configuration.showKey();

        } catch (Exception e) {
            System.out.println("Error while modifying static field");
        }
    }
}

