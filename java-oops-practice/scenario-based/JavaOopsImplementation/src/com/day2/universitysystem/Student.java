package com.day2.universitysystem;

class Student 
{
    private String name;
    private double gpa; // sensitive field

    Student(String name) 
    {
        this.name = name;
    }

    Student(String name, String elective) 
    { // with elective
        this.name = name;
    }

    protected void updateGPA(double totalPoints, int subjects) 
    {
        this.gpa = totalPoints / subjects;
    }

    public String getTranscript() {
        return "Student: " + name + ", GPA: " + gpa;
    }
}
