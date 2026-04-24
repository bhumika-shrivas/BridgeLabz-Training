import java.util.Scanner;

public class SmartParkingSystem
{
	// Define capacity of parking lot and initialize occupancy
		static int capacity = 100;
		static int occupancy = 0;
		
	public static void park()
	{
		if (occupancy < capacity)
		{
			System.out.println("Your vehicle is parked");
			occupancy++;
		}
		else
		{
			System.out.println("Parking Lot is full");
		}
	}
	
	public static void exit()
	{
		if (occupancy > 0)
		{
			System.out.println("Your vehicle is out of the Parking Lot");
			occupancy--;
		}
		else
		{
			System.out.print("Parking Lot is already empty");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String choice;
		
		do
		{
			System.out.print("Enter the option (Park, Exit, Show Occupancy, Close System) : ");
			String option = input.nextLine().toLowerCase();
			switch (option)
			{
				case "park":
				park();
				break;
				
				case "exit":
				exit();
				break;
				
				case "show occupancy":
				System.out.println("Occupancy of Parking Lot: " + occupancy);
				break;
				
				case "close system":
				System.out.print("Thank you for using Smart Parking System");
				input.close();
				return;
				
				default:
				System.out.print("Enter a valid option");
			}
			System.out.print("Do you want to continue using system (Yes/No) : ");
			choice = input.nextLine().toLowerCase();
		}
			while (choice.equals("yes"));	
	}
}