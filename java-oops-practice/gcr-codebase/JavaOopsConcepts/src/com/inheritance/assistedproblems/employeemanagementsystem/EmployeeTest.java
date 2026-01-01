package com.inheritance.assistedproblems.employeemanagementsystem;

// Main class
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Manager("Rohit", 101, 80000, 10);
        Employee e2 = new Developer("Amit", 102, 60000, "Java");
        Employee e3 = new Intern("Neha", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
