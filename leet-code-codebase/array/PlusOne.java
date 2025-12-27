import java.util.Scanner;
import java.util.Arrays;

public class PlusOne {

    // Function to increment the number by one
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9, create new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    // Main method for local testing
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the digits (space separated):");
        int[] digits = Arrays.stream(input.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();

        int[] output = plusOne(digits);

        System.out.println("Output: " + Arrays.toString(output));
    }
}
