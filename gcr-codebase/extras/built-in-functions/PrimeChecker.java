import java.util.Scanner;

public class PrimeChecker {

    // Method to check prime number
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // loop till square root
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
		// close scanner
        sc.close(); 
    }
}
