import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueBooking = "yes";

        while (continueBooking.equalsIgnoreCase("yes")) {

            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Regular\n2. 3D\n3. IMAX");
            int movieType = input.nextInt();

            System.out.println("Select Seat Type:");
            System.out.println("1. Gold\n2. Silver");
            int seatType = input.nextInt();

            System.out.print("Do you want snacks? (yes/no): ");
            input.nextLine();
            String snacks = input.nextLine();

            int price = 0;

            // Movie type pricing
            switch (movieType) {
                case 1: price += 150; break;
                case 2: price += 200; break;
                case 3: price += 300; break;
                default: System.out.println("Invalid movie type");
            }

            // Seat type pricing
            if (seatType == 1) {
                price += 100;
            } else if (seatType == 2) {
                price += 50;
            }

            // Snacks pricing
            if (snacks.equalsIgnoreCase("yes")) {
                price += 80;
            }

            System.out.println("Total Ticket Price: ₹" + price);

            System.out.print("\nBook ticket for another customer? (yes/no): ");
            continueBooking = input.nextLine();
        }

        input.close();
    }
}
