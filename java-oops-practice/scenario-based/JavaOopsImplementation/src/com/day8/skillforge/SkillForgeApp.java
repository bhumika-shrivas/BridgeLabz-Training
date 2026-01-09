package com.day8.skillforge;

import java.util.ArrayList;
import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Instructor name: ");
        Instructor instructor = new Instructor(sc.nextLine());

        System.out.print("Enter Student name: ");
        Student student = new Student(sc.nextLine());

        System.out.print("Course level (1. Beginner 2. Advanced): ");
        int level = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course title: ");
        String title = sc.nextLine();

        Course course;
        if (level == 1) {
            course = new BeginnerCourse(title, instructor);
        } else {
            ArrayList<String> modules = new ArrayList<>();
            System.out.print("Enter number of modules: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Module " + (i + 1) + ": ");
                modules.add(sc.nextLine());
            }
            course = new AdvancedCourse(title, instructor, modules);
        }

        System.out.print("Modules completed by student: ");
        int completed = sc.nextInt();

        student.updateProgress(completed, course.getModules().size());
        course.generateCertificate(student);

        sc.close();
    }
}
