import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // personData[i][0] = weight
        // personData[i][1] = height
        // personData[i][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (personData[i][0] <= 0);

            // Height input
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] =
                    personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.printf("BMI: %.2f%n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
