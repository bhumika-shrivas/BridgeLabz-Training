package com.reflection.basiclevel;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full class name example java.util.ArrayList");
        String className = sc.nextLine();

        try {
            // Load class at runtime
            Class<?> cls = Class.forName(className);

            System.out.println("Class Name: " + cls.getName());

            // Get methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }

            // Get fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f.getName());
            }

            // Get constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c.getName());
            }

        } catch (Exception e) {
            System.out.println("Invalid class name or error occurred");
        }

        sc.close();
    }
}

