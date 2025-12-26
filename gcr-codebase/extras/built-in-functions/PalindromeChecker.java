import java.util.Scanner;

public class PalindromeChecker {

    // Method to take input
    public static String takeInput(Scanner sc) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        return sc.nextLine();
		
        // Close scanner
        sc.close();
    }
    // Method to check palindrome using built-in functions
    public static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase
        String cleaned = str.replace(" ", "").toLowerCase();

        // Reverse string using StringBuilder
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original and reversed string
        return cleaned.equals(reversed);
    }

    // Method to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);

        // Close scanner
        sc.close();
    }
}
