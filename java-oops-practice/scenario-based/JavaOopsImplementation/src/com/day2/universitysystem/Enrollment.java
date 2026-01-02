package com.day2.universitysystem;

class Enrollment implements Graded 
{
    private Student student;
    private Course course;
    private double gradePoint;

    Enrollment(Student student, Course course) 
    {
        this.student = student;
        this.course = course;
    }

    public void assignGrade(double marks) 
    {
        if (marks >= 90) gradePoint = 10;
        else if (marks >= 75) gradePoint = 8;
        else if (marks >= 60) gradePoint = 6;
        else gradePoint = 4;

        student.updateGPA(gradePoint, 1);
    }
}
