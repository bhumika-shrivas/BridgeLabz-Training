import java.util.Scanner;

public class FirstOccurrence {

    // Function to find first occurrence of needle in haystack
    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i; // match found
            }
        }
        return -1; // no match
    }

    // Main method for user input
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter haystack string: ");
        String haystack = input.nextLine();

        System.out.print("Enter needle string: ");
        String needle = input.nextLine();

        int result = strStr(haystack, needle);
        System.out.println("Output: " + result);
    }
}
