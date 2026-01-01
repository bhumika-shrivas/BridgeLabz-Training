package com.objectmodelling.associationandaggregationproblem3;

public class UniversityManagementDemo {
    public static void main(String[] args) {

        University university = new University("National Tech University");

        Student s1 = new Student("Aman");
        Student s2 = new Student("Neha");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Mehta");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        university.addStudent(s1);
        university.addStudent(s2);
        university.addProfessor(p1);
        university.addProfessor(p2);
        university.addCourse(c1);
        university.addCourse(c2);

        // Communication
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Display
        university.showUniversityDetails();
        s2.showCourses();
        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
