import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status for each person
    // Returns a 2D String array with Height, Weight, BMI and Status
    public static String[][] calculateBMIAndStatus(double[][] hwData) {

        String[][] result = new String[hwData.length][4];

        for (int i = 0; i < hwData.length; i++) {

            double weight = hwData[i][0];   // weight in kg
            double heightCm = hwData[i][1]; // height in cm
            double heightM = heightCm / 100; // convert cm to meter

            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to process input array and return result array
    public static String[][] processBMI(double[][] hwData) {
        return calculateBMIAndStatus(hwData);
    }

    // Method to display the BMI report in tabular format
    public static void displayBMIReport(String[][] data) {

        System.out.println("\n----------------------------------------------------------");
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t\t" +
                    data[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: 10 rows, 2 columns (weight, height)
        double[][] hwData = new double[10][2];

        for (int i = 0; i < hwData.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            hwData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            hwData[i][1] = sc.nextDouble();
        }

        String[][] bmiResult = processBMI(hwData);

        displayBMIReport(bmiResult);

        sc.close();
    }
}
