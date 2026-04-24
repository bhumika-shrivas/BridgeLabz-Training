import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // marks[i][0] = Physics, marks[i][1] = Chemistry, marks[i][2] = Maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics marks: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry marks: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths marks: ");
            marks[i][2] = sc.nextInt();

            // Validation for negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Marks must be positive. Re-enter student details.");
                i--;   // decrement index to re-enter values
            }
        }

        // Calculate percentage and grade using 2D array
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // Display result
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%%n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}
