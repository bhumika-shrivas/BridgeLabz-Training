import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check whether a character is vowel or consonant
    public static String checkChar(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
		
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String result = checkChar(ch);

                if (result.equals("Vowel")) {
                    vowelCount++;
                } else if (result.equals("Consonant")) {
                    consonantCount++;
                }

            } catch (Exception e) {
                break; // stops when index goes out of range
            }
        }

        int[] count = new int[2];
        count[0] = vowelCount;
        count[1] = consonantCount;

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] result = findVowelsAndConsonants(text);

        System.out.println("\nVowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);

        sc.close();
    }
}
