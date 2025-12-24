import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store it in the array
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];      
            double heightCm = data[i][1];    
            double heightM = heightCm / 100; 

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; // store BMI
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {

        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: rows = 10 persons, columns = weight, height, BMI
        double[][] persons = new double[10][3];

        for (int i = 0; i < persons.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        
        calculateBMI(persons);

        
        System.out.println("\nBMI REPORT   ");
        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double height = persons[i][1];
            double bmi = persons[i][2];

            String status = getBMIStatus(bmi);

            System.out.println("Person " + (i + 1)
                    + " | Weight: " + weight + " kg"
                    + " | Height: " + height + " cm"
                    + " | BMI: " + String.format("%.2f", bmi)
                    + " | Status: " + status);
        }

        sc.close();
    }
}
