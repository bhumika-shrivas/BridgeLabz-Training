import java.util.Arrays;
import java.util.Scanner;

public class ExtendedNumberChecker {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static int findSumOfSquares(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("\nDigit Count: " + count);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int sum = findSumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);

        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "       " + frequency[i][1]);
            }
        }

        input.close();
    }
}
