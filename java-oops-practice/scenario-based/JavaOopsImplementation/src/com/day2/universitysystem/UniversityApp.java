package com.day2.universitysystem;

public class UniversityApp 
{
    public static void main(String[] args) 
    {

        Student s1 = new Undergraduate("Anita");
        Course c1 = new Course("CS101", "Java Programming");

        Faculty f1 = new Faculty("Dr. Mehta");

        Enrollment e1 = new Enrollment(s1, c1);
        f1.gradeStudent(e1, 85);

        System.out.println(s1.getTranscript());

        Graded passFail = new PassFailEnrollment();
        f1.gradeStudent(passFail, 45);
    }
}
