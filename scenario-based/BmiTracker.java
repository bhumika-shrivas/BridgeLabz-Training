import java.util.Scanner;

public class BmiTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (meters): ");
        double height = sc.nextDouble();

        // BMI calculation
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        // BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}
