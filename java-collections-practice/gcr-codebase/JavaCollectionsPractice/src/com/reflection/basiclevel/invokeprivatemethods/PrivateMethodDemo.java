package com.reflection.basiclevel.invokeprivatemethods;

import java.lang.reflect.Method;

public class PrivateMethodDemo {

    public static void main(String[] args) {

        try {
            Calculator cal = new Calculator();

            Class<?> cls = cal.getClass();

            // Access private method
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Allow access
            method.setAccessible(true);

            // Invoke method
            Object result = method.invoke(cal, 5, 4);

            System.out.println("Result is: " + result);

        } catch (Exception e) {
            System.out.println("Error while invoking method");
        }
    }
}

