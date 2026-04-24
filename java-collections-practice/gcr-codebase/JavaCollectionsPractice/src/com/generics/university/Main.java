package com.generics.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<CourseType> courseTypes = new ArrayList<>();

        System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine();
        Department department = new Department(deptName);

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nChoose Course Evaluation Type:");
            System.out.println("1. Exam Based");
            System.out.println("2. Assignment Based");
            System.out.println("3. Research Based");

            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course Name: ");
            String courseName = sc.nextLine();

            System.out.print("Enter Course Code: ");
            String courseCode = sc.nextLine();

            CourseType type = null;

            switch (choice) {
                case 1:
                    type = new ExamCourse();
                    break;
                case 2:
                    type = new AssignmentCourse();
                    break;
                case 3:
                    type = new ResearchCourse();
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    continue;
            }

            Course<CourseType> course = new Course<>(courseName, courseCode, type);
            System.out.println(course.getCourseDetails());
            courseTypes.add(type);
        }

        department.displayCourses(courseTypes);
        sc.close();
    }
}
