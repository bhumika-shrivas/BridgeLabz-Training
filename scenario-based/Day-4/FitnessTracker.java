import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] pushUps = new int[7];
        String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        // Store push-ups (0 means rest day)
        for (int i = 0; i < days.length; i++) {
            System.out.print("Enter push-ups for " + days[i] + " (0 for rest day): ");
            pushUps[i] = input.nextInt();
        }

        int total = 0;
        int activeDays = 0;

        // Calculate total & average using for-each
        for (int count : pushUps) {
            if (count == 0) {
                continue; // skip rest days
            }
            total += count;
            activeDays++;
        }

        double average = activeDays > 0 ? (double) total / activeDays : 0;

        System.out.println("\nTotal push-ups (excluding rest days): " + total);
        System.out.println("Average push-ups per active day: " + average);

        input.close();
    }
}
