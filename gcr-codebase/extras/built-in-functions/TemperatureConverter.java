import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Take user input
    public static double getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
		// close scanner
        sc.close(); 
        return temp;
    }

    // Display result
    public static void displayResult(double result, String unit) {
        System.out.println("Converted temperature: " + result + " " + unit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double result = fahrenheitToCelsius(temp);
            System.out.println("Temperature in Celsius: " + result);
        } else if (choice == 2) {
            double result = celsiusToFahrenheit(temp);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else {
            System.out.println("Invalid choice");
        }
		// close scanner
        sc.close(); 
    }
}
