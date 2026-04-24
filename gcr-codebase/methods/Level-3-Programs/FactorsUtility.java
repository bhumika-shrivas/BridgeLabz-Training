import java.util.Arrays;
import java.util.Scanner;

public class FactorsUtility {

    // Method to find factors of a number 
    public static int[] findFactors(int number) {

        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];

        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }

        return greatest;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("\nFactors of " + number + ": " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

        input.close();
    }
}
