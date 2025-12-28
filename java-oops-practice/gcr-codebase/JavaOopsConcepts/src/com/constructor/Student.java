package com.constructor.level1;

public class Student {

    public int rollNumber;

    protected String name;

    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
    
    // Public getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Display method
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + cgpa);
    }
}
