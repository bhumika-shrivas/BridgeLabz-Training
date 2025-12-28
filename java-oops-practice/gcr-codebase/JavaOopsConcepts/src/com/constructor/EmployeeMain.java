package com.constructor.level1;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department:");
        String dept = sc.nextLine();
        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Designation:");
        String designation = sc.nextLine();

        Manager manager = new Manager(id, dept, salary, designation);
        
        System.out.println("\n--- Manager Details ---");
        manager.displayManagerDetails();
        
        System.out.println("\nEnter new salary:");
        double newSalary = sc.nextDouble();
        manager.setSalary(newSalary);

        System.out.println("\n--- Updated Details ---");
        manager.displayManagerDetails();

        sc.close();
    }
}
