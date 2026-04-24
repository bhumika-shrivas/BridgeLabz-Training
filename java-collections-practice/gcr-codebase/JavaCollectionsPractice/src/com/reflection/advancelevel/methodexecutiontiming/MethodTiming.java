package com.reflection.advancelevel.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodTiming {

	public static void main(String[] args) {

        try {
            TestClass obj = new TestClass();
            Class<?> cls = obj.getClass();

            // Get method by name
            Method method = cls.getMethod("doSomething");

            // Measure start time
            long start = System.nanoTime();
            method.invoke(obj); // invoke dynamically
            long end = System.nanoTime(); // measure end time

            System.out.println("Execution time in ms: " + (end - start) / 1000000);

        } catch (Exception e) {
            System.out.println("Error measuring method execution");
        }
    }
}
