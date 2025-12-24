import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters
    public static int[][] findCharFrequency(String text) {

        int[] freq = new int[256]; // ASCII character frequency

        // Step 1: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 3: Store characters and frequencies in 2D array
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;        // ASCII value of character
                result[index][1] = freq[i]; // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[][] result = findCharFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) result[i][0] + " : " + result[i][1]);
        }

        sc.close();
    }
}
