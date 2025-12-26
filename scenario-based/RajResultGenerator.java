import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double avg = sum / 5.0;
        System.out.println("Average: " + avg);

        switch ((int) avg / 10) {
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}
