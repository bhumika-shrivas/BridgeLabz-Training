import java.util.Scanner;

public class OnlineQuiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Questions array
        String[] questions = {
            "1. Which loop is best when the number of iterations is known?\n" +
            "A. while\nB. do-while\nC. for\nD. if",

            "2. What is the default value of an int array element in Java?\n" +
            "A. null\nB. 0\nC. garbage value\nD. undefined",

            "3. Which keyword is used to exit a loop immediately?\n" +
            "A. continue\nB. stop\nC. break\nD. exit",

            "4. What does continue do in a loop?\n" +
            "A. Stops the loop completely\nB. Skips the current iteration\n" +
            "C. Restarts the program\nD. Ends the program",

            "5. Which data type is used to store decimal values in Java?\n" +
            "A. int\nB. float\nC. char\nD. boolean"
        };

        // Correct answers
        char[] answers = {'C', 'B', 'C', 'B', 'B'};
        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(input.next().charAt(0));

            // Check answer using switch
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong! Correct answer is: " + answers[i]);
                    }
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        // Final score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " / " + questions.length);

        input.close();
    }
}
