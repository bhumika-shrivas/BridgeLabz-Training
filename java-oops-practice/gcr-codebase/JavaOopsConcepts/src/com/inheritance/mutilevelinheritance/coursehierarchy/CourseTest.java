package com.inheritance.mutilevelinheritance.coursehierarchy;

// Main Class
public class CourseTest {
    public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 40);

        OnlineCourse c2 = new OnlineCourse(
                "Data Structures", 60, "Coursera", true
        );

        PaidOnlineCourse c3 = new PaidOnlineCourse(
                "Advanced Java", 80, "Udemy", true, 5000, 20
        );

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
