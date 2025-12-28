package com.constructor.level1;

public class PostgraduateStudent extends Student {

    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number     : " + rollNumber);   // public
        System.out.println("Student Name    : " + name);         // protected
        System.out.println("Specialization  : " + specialization);
        System.out.println("CGPA            : " + getCGPA());    // private via getter
    }
}
