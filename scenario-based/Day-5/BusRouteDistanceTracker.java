/*Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance = 0;
        char choice;

        System.out.println("Welcome to Bus Route Distance Tracker 🚌");

        do {
            // Add distance for each stop
            distance += 5;
            System.out.println("\nBus reached a stop. Distance covered: " + distance + " km");

            System.out.print("Do you want to get off? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'n' || choice == 'N'); // exit when user says yes

        System.out.println("\nTotal distance travelled: " + distance + " km");
        input.close();
    }
}
