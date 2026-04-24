import java.util.Scanner;

public class TrimSpaces {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

        // Find length without using length()
        try {
            while (true) {
                text.charAt(end);
                end++;
            }
        } catch (Exception e) {
            end = end - 1;
        }

        // Trim leading spaces
        while (text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (text.charAt(end) == ' ') {
            end--;
        }

        int[] indexes = new int[2];
        indexes[0] = start;
        indexes[1] = end;

        return indexes;
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        int i = 0;

        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (Exception e) {
            // reached end of one or both strings
        }

        try {
            s2.charAt(i);
            return false;
        } catch (Exception e) {
            // both strings ended together
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // User-defined trim logic
        int[] indexes = findTrimIndexes(text);
        String trimmedText = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim()
        String builtInTrim = text.trim();

        // Compare both results
        boolean isSame = compareStrings(trimmedText, builtInTrim);

        System.out.println("\nTrimmed using charAt(): '" + trimmedText + "'");
        System.out.println("Trimmed using trim():   '" + builtInTrim + "'");
        System.out.println("\nBoth results are same: " + isSame);

        sc.close();
    }
}
