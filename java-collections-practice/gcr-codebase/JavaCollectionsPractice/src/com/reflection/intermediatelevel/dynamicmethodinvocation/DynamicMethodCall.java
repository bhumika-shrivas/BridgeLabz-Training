package com.reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodCall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            MathOperations obj = new MathOperations();

            Class<?> cls = obj.getClass();

            System.out.println("Enter method name add or subtract or multiply");
            String methodName = sc.nextLine();

            System.out.println("Enter first number");
            int a = sc.nextInt();

            System.out.println("Enter second number");
            int b = sc.nextInt();

            // Get method using name and parameter types
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Call method dynamically
            Object result = method.invoke(obj, a, b);

            System.out.println("Result is " + result);

        } catch (Exception e) {
            System.out.println("Invalid method name or error occurred");
        }

        sc.close();
    }
}

