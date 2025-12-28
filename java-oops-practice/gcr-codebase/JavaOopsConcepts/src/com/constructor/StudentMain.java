package com.constructor.level1;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Student
        System.out.println("Enter roll number for Student:");
        int roll1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name for Student:");
        String name1 = sc.nextLine();
        System.out.println("Enter CGPA for Student:");
        double cgpa1 = sc.nextDouble();
        sc.nextLine();

        Student s1 = new Student(roll1, name1, cgpa1);
        System.out.println("\n--- Student Details ---");
        s1.displayStudentDetails();

        // Update CGPA using setter
        System.out.println("\nEnter new CGPA for Student:");
        double newCgpa = sc.nextDouble();
        s1.setCGPA(newCgpa);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        sc.nextLine(); 

        // Input for PostgraduateStudent
        System.out.println("\nEnter roll number for Postgraduate Student:");
        int roll2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name for Postgraduate Student:");
        String name2 = sc.nextLine();
        System.out.println("Enter CGPA for Postgraduate Student:");
        double cgpa2 = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("Enter specialization for Postgraduate Student:");
        String specialization = sc.nextLine();

        PostgraduateStudent pg = new PostgraduateStudent(roll2, name2, cgpa2, specialization);
        System.out.println("\n--- Postgraduate Student Details ---");
        pg.displayPostgraduateDetails();

        sc.close();
    }
}
