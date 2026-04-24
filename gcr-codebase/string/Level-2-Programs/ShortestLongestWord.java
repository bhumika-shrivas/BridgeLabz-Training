import java.util.Scanner;

public class ShortestLongestWord {

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int count = 1;
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ')
                    count++;
            } catch (Exception e) {
                break;
            }
        }

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    words[index++] = temp;
                    temp = "";
                } else {
                    temp += ch;
                }
            } catch (Exception e) {
                words[index] = temp;
                break;
            }
        }
        return words;
    }

    // Method to find length without using length()
    public static int findLength(String word) {

        int count = 0;
        for (int i = 0; ; i++) {
            try {
                word.charAt(i);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    // Method to store word and length in 2D array
    public static String[][] wordWithLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            data[i][0] = words[i];
            data[i][1] = String.valueOf(len);
        }
        return data;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestAndLongest(String[][] data) {

        int shortest = 0, longest = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < Integer.parseInt(data[shortest][1]))
                shortest = i;

            if (len > Integer.parseInt(data[longest][1]))
                longest = i;
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordWithLength(words);
        int[] result = findShortestAndLongest(data);

        System.out.println("\nWords with Length:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " -> " + data[i][1]);
        }

        System.out.println("\nShortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word : " + data[result[1]][0]);

        sc.close();
    }
}
