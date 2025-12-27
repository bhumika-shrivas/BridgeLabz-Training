package com.constructor.level1;

import java.util.Scanner;

public class CourseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first course name:");
        String course1 = sc.nextLine();

        System.out.println("Enter duration (in months):");
        int duration1 = sc.nextInt();

        System.out.println("Enter course fee:");
        double fee1 = sc.nextDouble();
        
        sc.nextLine(); 

        Course c1 = new Course(course1, duration1, fee1);

        // Second course input
        System.out.println("\nEnter second course name:");
        String course2 = sc.nextLine();

        System.out.println("Enter duration (in months):");
        int duration2 = sc.nextInt();

        System.out.println("Enter course fee:");
        double fee2 = sc.nextDouble();
        sc.nextLine();

        Course c2 = new Course(course2, duration2, fee2);

        // Update institute name
        System.out.println("\nEnter new institute name:");
        String newInstitute = sc.nextLine();
        Course.updateInstituteName(newInstitute);

        // Display details
        System.out.println("\n--- Course Details ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        sc.close();
    }
}
