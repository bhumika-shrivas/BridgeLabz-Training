import java.util.Scanner;

public class GcdLcmCalculator {

    // Method to calculate GCD
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return calculateGCD(b, a % b); 
    }

    // Method to calculate LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b); 
    }

    // Method to take input
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        sc.close(); // close scanner

        return new int[]{num1, num2};
    }

    // Method to display output
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
        int[] numbers = getInput();                
        int gcd = calculateGCD(numbers[0], numbers[1]); 
        int lcm = calculateLCM(numbers[0], numbers[1]); 
        displayResult(numbers[0], numbers[1], gcd, lcm); 
    }
}
