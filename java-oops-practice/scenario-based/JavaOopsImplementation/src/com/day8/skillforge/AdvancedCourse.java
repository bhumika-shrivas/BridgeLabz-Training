package com.day8.skillforge;

import java.util.ArrayList;   // ✅ REQUIRED

class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, ArrayList<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() >= 90) {
            System.out.println("Advanced Certificate with Distinction awarded to " + student.getName());
        } else {
            System.out.println("Advanced certificate requires higher completion.");
        }
    }
}
