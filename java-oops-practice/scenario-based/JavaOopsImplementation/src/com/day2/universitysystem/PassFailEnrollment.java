package com.day2.universitysystem;

class PassFailEnrollment implements Graded 
{
    public void assignGrade(double marks) 
    {
        if (marks >= 50)
            System.out.println("Status: PASS");
        else
            System.out.println("Status: FAIL");
    }
}
