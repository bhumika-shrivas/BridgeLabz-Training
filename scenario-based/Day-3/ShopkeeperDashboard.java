/* Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments. */

import java.util.Scanner;

public class ShopkeeperDashboard
{	
	public static double discount(double bill, double percent)
	{
		//Calculate bill after discount
		bill = bill - ((percent/100)*bill);
		
		return bill;
	}
	
	public static void main(String [] args)
	{	
		Scanner input = new Scanner(System.in);
		
		// Input total number of items in Shop
		System.out.println("Enter the total number of items: ");
		int itemsQuantity = input.nextInt();
		
		// Create Array to store prices of items
		double[] itemsPrice = new double[itemsQuantity];
		
		// Store price in Array
		for (int i=0; i<itemsQuantity; i++)
		{
			System.out.println("Enter price for item " + (i+1) + ": " );
			itemsPrice[i] = input.nextDouble();
		}
		
		// Input number of Discount schemes
		System.out.println("Enter how many discounts you want to give: ");
		int numOfDiscount = input.nextInt();
		
		// Create Array to store values for Discount schemes
		double[] billAmount = new double[numOfDiscount];
		double[] percent = new double[numOfDiscount];
		
		// Store values for Discount scheme
		for (int j=0; j<numOfDiscount; j++)
		{
			System.out.println("Enter the amount you want to give discount on: ");
			billAmount[j] = input.nextInt();
			
			System.out.println("Enter the percent of discount you want to give on " + billAmount[j] + ": ");
			percent[j] = input.nextInt();
		}
		
		//Bill Counter
		System.out.println("---Bill Counter---");
		System.out.println("Enter the total amount on bill: ");
		
		double bill = input.nextInt();
		double appliedDiscount = 0.0;
		double output = 0.0;
		
		// Calculate bill and discount
		for (int a=0; a<numOfDiscount; a++)
		{
			if (bill >= billAmount[a])
			{
				appliedDiscount = percent[a];
				output = discount(bill, appliedDiscount);
			}
			else
			{
				output = bill;
			}
		}
		
		// Show Bill
		System.out.println("Your total bill: " + bill);
		System.out.println("Your total discount percent: " + appliedDiscount + "%" );
		System.out.println("Your total bill after discount: " + output);
		
		input.close();
	}
}