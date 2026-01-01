package com.inheritance.hierarchicalinheritance.schoolsystem;

// Main Class
public class SchoolTest {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Riya", 16, "10th Grade");
        Person p3 = new Staff("Anil", 35, "Administration");

        p1.displayRole();
        p1.displayDetails();
        System.out.println();

        p2.displayRole();
        p2.displayDetails();
        System.out.println();

        p3.displayRole();
        p3.displayDetails();
    }
}
