package com.objectmodelling.compositionproblem;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    public void showEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}
