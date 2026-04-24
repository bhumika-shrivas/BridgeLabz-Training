import java.util.Scanner;

public class WordLength2D {

    // Method to find length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // stops when index goes out of range
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] manualSplit(String text) {

        int len = getLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space positions
        int[] spaceIndex = new int[wordCount + 1];
        spaceIndex[0] = -1;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }
        spaceIndex[k] = len;

        // Extract words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array (word, length)
    public static String[][] getWordLength2D(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                       
            result[i][1] = String.valueOf(getLength(words[i])); // length as String
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = manualSplit(text);

        // Create 2D array of word and length
        String[][] wordLength = getWordLength2D(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordLength.length; i++) {
            int length = Integer.parseInt(wordLength[i][1]); // convert String to int
            System.out.println(wordLength[i][0] + "\t" + length);
        }

        sc.close();
    }
}
