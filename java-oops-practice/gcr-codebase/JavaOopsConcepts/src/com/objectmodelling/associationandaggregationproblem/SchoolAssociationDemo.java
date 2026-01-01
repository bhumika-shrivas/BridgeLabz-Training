package com.objectmodelling.associationandaggregationproblem;

public class SchoolAssociationDemo {
    public static void main(String[] args) {

        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student aman = new Student("Aman");
        Student neha = new Student("Neha");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course computer = new Course("Computer Science");

        // Aggregation: add students to school
        school.addStudent(aman);
        school.addStudent(neha);

        // Association: enroll students in courses
        aman.enrollCourse(math);
        aman.enrollCourse(computer);

        neha.enrollCourse(science);
        neha.enrollCourse(computer);

        // Display details
        school.showStudents();
        aman.showCourses();
        neha.showCourses();

        computer.showEnrolledStudents();
    }
}
