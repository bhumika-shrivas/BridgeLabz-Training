import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Polling closed.");
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.print("Vote (1-Candidate A, 2-Candidate B, 3-Candidate C): ");
                int vote = sc.nextInt();

                switch (vote) {
                    case 1:
                        System.out.println("Voted for Candidate A");
                        break;
                    case 2:
                        System.out.println("Voted for Candidate B");
                        break;
                    case 3:
                        System.out.println("Voted for Candidate C");
                        break;
                    default:
                        System.out.println("Invalid vote");
                }
            } else {
                System.out.println("Not eligible to vote");
            }
        }
    }
}
