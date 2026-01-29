package com.reflection.basiclevel.privatefields;

import java.lang.reflect.Field;

public class PrivateFieldAccess {

    public static void main(String[] args) {

        try {
            Person p = new Person();

            // Get Class object
            Class<?> cls = p.getClass();

            // Access private field
            Field field = cls.getDeclaredField("age");

            // Allow access to private field
            field.setAccessible(true);

            // Modify value
            field.set(p, 25);

            // Get value
            int value = (int) field.get(p);
            System.out.println("Modified Age: " + value);

            p.showAge();

        } catch (Exception e) {
            System.out.println("Error while accessing field");
        }
    }
}

