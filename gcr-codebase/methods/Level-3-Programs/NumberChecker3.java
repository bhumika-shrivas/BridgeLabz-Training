import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    // Method to store digits of number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to check Palindrome number using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck number
    // Duck number → contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
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

        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversedDigits));

        System.out.println("Are Original and Reversed Arrays Equal? "
                + compareArrays(digits, reversedDigits));

        System.out.println("Is Palindrome Number? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        input.close();
    }
}
