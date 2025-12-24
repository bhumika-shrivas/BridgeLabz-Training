import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A–Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference
                ch = (char) (ch + 32);
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String userLowerCase = convertToLowerCase(text);

        // Convert using built-in method
        String builtInLowerCase = text.toLowerCase();
		
        boolean result = compareStrings(userLowerCase, builtInLowerCase);

        System.out.println("\nLowercase using user-defined method: " + userLowerCase);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowerCase);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
