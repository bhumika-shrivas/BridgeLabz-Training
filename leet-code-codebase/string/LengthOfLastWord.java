import java.util.Scanner;

public class LengthOfLastWord {

    // Function to find length of the last word
    public static int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    // Main method for user input
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = input.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println("Output: " + result);
    }
}
