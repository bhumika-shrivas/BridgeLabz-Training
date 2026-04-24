package com.annotations.beginnerlevel.customannotation;

import java.lang.reflect.Method;

public class ImportantMethodsMain {

	public static void main(String[] args) {

        // Create object of class
        ServiceClass obj = new ServiceClass();

        // Get all methods of the class
        Method[] methods = obj.getClass().getDeclaredMethods();

        System.out.println("Important Methods Found:\n");

        // Loop through all methods
        for (Method m : methods) {

            // Check if method has @ImportantMethod annotation
            if (m.isAnnotationPresent(ImportantMethod.class)) {

                // Get annotation object
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);

                // Print method name and level
                System.out.println("Method Name: " + m.getName());
                System.out.println("Importance Level: " + im.level());
                System.out.println("--------------------------");
            }
        }
    }
}
