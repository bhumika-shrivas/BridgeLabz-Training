import java.util.Scanner;

public class NumberAnalyzer {

    // Method to check whether number is positive
    public static boolean isPositive(int number) {

        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check whether number is even
    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " is ");

            if (isPositive(numbers[i])) {

                if (isEven(numbers[i])) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }

            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last elements:");

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
