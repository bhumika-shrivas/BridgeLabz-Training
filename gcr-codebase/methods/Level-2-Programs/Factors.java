import java.util.Scanner;

public class FactorsOfNumber {

    // Method to find factors and return array
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println();
        System.out.println("Sum of factors = " + findSum(factors));
        System.out.println("Product of factors = " + findProduct(factors));
        System.out.println("Sum of squares of factors = " + findSumOfSquares(factors));

        input.close();
    }
}
