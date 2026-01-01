package com.objectmodelling.compositionandaggregationproblem;

public class UniversityDemo {
    public static void main(String[] args) {

        // Faculty exist independently (aggregation)
        Faculty profA = new Faculty("Dr. Sharma", "Computer Science");
        Faculty profB = new Faculty("Dr. Mehta", "Mathematics");

        // Create university (composition owner)
        University university = new University("Global Tech University");

        // Create departments
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        // Add faculty to departments
        cs.addFaculty(profA);
        cs.addFaculty(profB);
        math.addFaculty(profB); // same faculty in another department

        // Add departments to university
        university.addDepartment(cs);
        university.addDepartment(math);

        // Display structure
        university.showUniversityDetails();

        // Delete university (composition effect)
        university.closeUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists after university deletion:");
        profA.displayFaculty();
        profB.displayFaculty();
    }
}
