import java.util.Scanner;

public class FactorialRecursion {

    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); 
    }

    // Method to take input
    public static int getInput() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        return sc.nextInt();
		sc.close();

    }

    // Method to display output
    static void displayResult(int num, int result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {

		int num = getInput();             
        int result = factorial(num);       
        displayResult(num, result); 

    }
}
