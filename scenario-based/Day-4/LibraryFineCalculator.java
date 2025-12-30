import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int FINE_PER_DAY = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter due date (day): ");
            int dueDate = input.nextInt();

            System.out.print("Enter return date (day): ");
            int returnDate = input.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * FINE_PER_DAY;
                System.out.println("Late by " + lateDays + " days. Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        input.close();
    }
}
