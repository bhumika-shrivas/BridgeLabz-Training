import java.util.Scanner;
import java.util.Random;

public class StudentScoreCard {

    // a) Generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    // b) Calculate total, average and percentage
    public static double[][] calculateResult(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // c) Calculate grade based on percentage
    public static String[] calculateGrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percent = result[i][2];

            if (percent >= 80)
                grade[i] = "A";
            else if (percent >= 70)
                grade[i] = "B";
            else if (percent >= 60)
                grade[i] = "C";
            else if (percent >= 50)
                grade[i] = "D";
            else if (percent >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }
        return grade;
    }

    // d) Display scorecard
    public static void displayScoreCard(
            int[][] scores, double[][] result, String[] grade) {

        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] result = calculateResult(scores);
        String[] grade = calculateGrade(result);

        displayScoreCard(scores, result, grade);

        sc.close();
    }
}
