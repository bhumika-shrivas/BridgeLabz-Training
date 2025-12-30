import java.util.Scanner;

public class TrainReservationQueue {

    // Cities
    static String[] cities = {
        "Bhopal", "Ujjain", "Indore", "Jabalpur",
        "Umaria", "Chindwada", "Jhansi", "Patna"
    };

    // Seat availability
    static int firstAC = 2;
    static int secondAC = 2;
    static int thirdAC = 3;
    static int thirdEconomy = 3;
    static int executiveChair = 4;
    static int acChair = 4;

    // Show trains
    public static void showTrains() {
        System.out.println(
            "1. Shipra Express\n" +
            "2. Malwa Express\n" +
            "3. Avantika Express\n" +
            "4. MP Sampark Kranti Express"
        );
    }

    // Show seat menu
    public static void showSeats() {
        System.out.println(
            "1. 1A (AC First Class)\n" +
            "2. 2A (AC 2-Tier)\n" +
            "3. 3A (AC 3-Tier)\n" +
            "4. 3E (AC 3-Tier Economy)\n" +
            "5. EC (Executive Chair Car)\n" +
            "6. CC (AC Chair Car)"
        );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Departure
        System.out.println("Choose departure station:");
        for (String city : cities) System.out.println(city);
        String from = input.nextLine();

        // Destination
        System.out.println("\nChoose destination station:");
        for (String city : cities) {
            if (!city.equalsIgnoreCase(from)) {
                System.out.println(city);
            }
        }
        String to = input.nextLine();

        // Train selection
        System.out.println("\nAvailable Trains:");
        showTrains();
        int trainChoice = input.nextInt();
        input.nextLine(); // consume newline

        boolean booking = true;

        // Booking loop
        while (booking) {
            System.out.println("\nChoose Seat Type:");
            showSeats();
            int seatChoice = input.nextInt();

            switch (seatChoice) {

                case 1:
                    if (firstAC > 0) {
                        firstAC--;
                        System.out.println("1A Seat booked successfully!");
                    } else {
                        System.out.println("1A seats full!");
                    }
                    break;

                case 2:
                    if (secondAC > 0) {
                        secondAC--;
                        System.out.println("2A Seat booked successfully!");
                    } else {
                        System.out.println("2A seats full!");
                    }
                    break;

                case 3:
                    if (thirdAC > 0) {
                        thirdAC--;
                        System.out.println("3A Seat booked successfully!");
                    } else {
                        System.out.println("3A seats full!");
                    }
                    break;

                case 4:
                    if (thirdEconomy > 0) {
                        thirdEconomy--;
                        System.out.println("3E Seat booked successfully!");
                    } else {
                        System.out.println("3E seats full!");
                    }
                    break;

                case 5:
                    if (executiveChair > 0) {
                        executiveChair--;
                        System.out.println("Executive Chair Seat booked!");
                    } else {
                        System.out.println("Executive Chair seats full!");
                    }
                    break;

                case 6:
                    if (acChair > 0) {
                        acChair--;
                        System.out.println("AC Chair Seat booked!");
                    } else {
                        System.out.println("AC Chair seats full!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            // Check if all seats full
            if (firstAC == 0 && secondAC == 0 && thirdAC == 0 &&
                thirdEconomy == 0 && executiveChair == 0 && acChair == 0) {
                System.out.println("\nAll seats are booked. Booking closed.");
                break;
            }

            System.out.print("\nDo you want to book another ticket? (yes/no): ");
            input.nextLine();
            String choice = input.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                booking = false;
            }
        }

        System.out.println("\nThank you for using Train Reservation System");
        input.close();
    }
}
