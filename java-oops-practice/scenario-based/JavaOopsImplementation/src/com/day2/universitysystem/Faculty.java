package com.day2.universitysystem;

class Faculty 
{
    private String name;

    Faculty(String name) 
    {
        this.name = name;
    }

    public void gradeStudent(Graded g, double marks) 
    {
        g.assignGrade(marks);
    }
}
