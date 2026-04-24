import java.util.Scanner;

public class FibonacciGenerator {

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        // Print Fibonacci numbers
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = Math.addExact(first, second); // built-in addition
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        printFibonacci(terms);

        // Close scanner
        sc.close();
    }
}
