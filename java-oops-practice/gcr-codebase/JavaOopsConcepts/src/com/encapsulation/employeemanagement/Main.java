package com.encapsulation.employeemanagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 80, 300);

        e1.assignDepartment("HR");
        e2.assignDepartment("IT");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism in action
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
