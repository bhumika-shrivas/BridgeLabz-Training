import java.util.*;

public class UppercaseConversion{
	
	// Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a–z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference
                ch = (char) (ch - 32);
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
	
	public static void main(String[] args){
	
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String userUpperCase = convertToUpperCase(text);

        // Convert using built-in method
        String builtInUpperCase = text.toUpperCase();

        // Compare both results
        boolean result = compareStrings(userUpperCase, builtInUpperCase);

        System.out.println("\nUppercase using user-defined method: " + userUpperCase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpperCase);
        System.out.println("Are both results equal? " + result);

        sc.close();
	}
}
	    
		