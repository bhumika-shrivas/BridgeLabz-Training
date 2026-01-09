package com.day8.skillforge;

class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() >= 80) {
            System.out.println("Beginner Certificate awarded to " + student.getName());
        } else {
            System.out.println("Complete more modules to get certificate.");
        }
    }
}
