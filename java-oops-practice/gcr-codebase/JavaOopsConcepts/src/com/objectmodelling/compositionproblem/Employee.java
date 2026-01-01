package com.objectmodelling.compositionproblem;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
