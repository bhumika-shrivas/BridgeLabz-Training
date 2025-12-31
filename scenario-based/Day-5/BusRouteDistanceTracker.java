/*Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int distance = 0;
		char  choice;
		
		System.out.println("\nWelcome to Bus Route Distance Tracker\n");
		
		do
		{	
			System.out.println("\nDo you want to get off at a stop (y/n): ");
			choice = input.next().charAt(0);
			
			distance +=5;
		}
		while (choice == 'y');
		
		input.close();
		
		System.out.println("Total distance: " + distance + "km");
	}
}
		
		