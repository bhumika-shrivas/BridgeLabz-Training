import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess
    static int generateGuess(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Method to get user feedback
    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

    // Method to update range based on feedback
    static int[] updateRange(String feedback, int guess, int min, int max) {
        if (feedback.equals("high")) {
            max = guess - 1;
        } else if (feedback.equals("low")) {
            min = guess + 1;
        }
        return new int[] { min, max };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!isCorrect) {

            int guess = generateGuess(min, max);
            System.out.println("My guess is: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it correctly.");
                isCorrect = true;
            } else {
                int[] range = updateRange(feedback, guess, min, max);
                min = range[0];
                max = range[1];
            }
        }

        // Closing Scanner
        sc.close();
    }
}
