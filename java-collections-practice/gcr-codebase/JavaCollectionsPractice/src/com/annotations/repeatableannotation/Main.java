package com.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

        try {
            // Get method
            Method method = TestApp.class.getMethod("runApp");

            // Get all BugReport annotations
            BugReport[] bugs = method.getAnnotationsByType(BugReport.class);

            // Print all bug reports
            System.out.println("Bug Reports:");
            for (BugReport bug : bugs) {
                System.out.println("- " + bug.description());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
