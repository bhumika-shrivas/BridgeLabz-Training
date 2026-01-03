package com.encapsulation.employeemanagement;

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    protected double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation (getters/setters)
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }

    abstract double calculateSalary(); // Abstraction

    public void displayDetails() {
        System.out.println(
            "ID: " + employeeId +
            ", Name: " + name +
            ", Dept: " + department +
            ", Salary: " + calculateSalary()
        );
    }
}
