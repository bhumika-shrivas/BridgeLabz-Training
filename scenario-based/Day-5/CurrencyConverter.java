/*Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;

public class CurrencyConverter
{
	// INR to US Dollar
	public static double usd(double inr)
	{
		return inr*0.011;
	}
	
	// INR to Euro
	public static double euro(double inr)
	{
		return inr*0.0095;
	}
	
	// INR to Japnese Yen
	public static double yen(double inr)
	{
		return inr*1.74;
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		char choice2;
		
		do
		{
			System.out.print("\nEnter the amount in INR: ");
			double inr = input.nextDouble();
			
			System.out.print("\nChoose the currency you to convert INR to (1/2/3): \n1. US Dollar \n2. Euro \n3. Japanese Yen\n ");
			int choice = input.nextInt();
			
			switch (choice)
			{
				case 1:
				System.out.println("INR " + inr + " equals $" + usd(inr));
				break;
				
				case 2:
				System.out.println("INR " + inr + " equals ¥" + euro(inr));
				break;
				
				case 3:
				System.out.println("INR " + inr + " equals ¥" + yen(inr));
				break;
				
				default:
				System.out.println("Enter a valid option");
				break;
			}
			
			System.out.println("\nDo you want to again convert currency? (y/n): ");
			choice2 = input.next().charAt(0);
		}
		while (choice2 == 'y');
		
		System.out.println("\nThank you for using currency converter");
		
		input.close();
	}
}