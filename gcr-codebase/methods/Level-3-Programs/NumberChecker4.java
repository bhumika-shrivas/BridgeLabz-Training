import java.util.Scanner;

public class NumberChecker4 {

    // Method to check Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon number
    // Sum of digits of square == number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // Method to check Spy number
    // Sum of digits == Product of digits
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }
	
	//Method to check Automorphic number
    // Square ends with the number itself
    
	public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }

        return true;
    }

    // Method to check Buzz number
    // Divisible by 7 OR ends with 7
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\nIs Prime Number? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeonNumber(number));
        System.out.println("Is Spy Number? " + isSpyNumber(number));
        System.out.println("Is Automorphic Number? " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number? " + isBuzzNumber(number));

        input.close();
    }
}
