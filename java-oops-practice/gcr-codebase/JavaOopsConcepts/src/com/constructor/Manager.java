package com.constructor.level1;

public class Manager extends Employee {

    private String designation;

    public Manager(int employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID  : " + employeeID);   // public
        System.out.println("Department   : " + department);   // protected
        System.out.println("Designation  : " + designation);
        System.out.println("Salary       : " + getSalary()); // private via getter
    }
}
