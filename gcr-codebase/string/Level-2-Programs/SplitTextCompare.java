import java.util.Scanner;

public class SplitTextCompare {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index is out of range
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextManually(String text) {

        int length = findLength(text);

        // Step 1: Count words
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !isWord) {
                wordCount++;
                isWord = true;
            } else if (ch == ' ') {
                isWord = false;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        // Step 3: Extract words
        String[] words = new String[wordCount];
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length - 1; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];

            if (start < end) {
                String word = "";
                for (int j = start; j < end; j++) {
                    word = word + text.charAt(j);
                }
                words[wordIndex++] = word;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Custom split
        String[] manualSplit = splitTextManually(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        System.out.println("\nManual Split Result:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split() Result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
		
        boolean result = compareArrays(manualSplit, builtInSplit);
        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
