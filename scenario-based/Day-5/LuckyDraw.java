/*Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;

public class LuckyDraw
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int num;
		int max, min;
		char choice;
		
		System.out.println("Welcome to Diwali Mela Lucky Draw! \nRule:\nIf the number is divisible by 3 and 5, you win a gift.");
		
		do
		{
			System.out.println("\nDo you want to draw a number (y/n):");
			choice = input.next().charAt(0);
			
			if (choice == 'y')
			{
				System.out.println("\nChoose the upper and lower limit to get a number for Lucky Draw\n");
				System.out.print("Upper limit: ");
				max = input.nextInt();
				System.out.print("Lower limit: ");
				min = input.nextInt();
				
				num = min + (int)(Math.random() * ((max - min) + 1));
				
				if (num%3 == 0 && num%5 == 0)
				{
					System.out.println("Number: " + num +"\nWoah! You won a gift. ");
				}
				else
				{
					System.out.println("Number: " + num +"\nSorry you lost. ");
				}				
			}
			else
			{
				System.out.println("Thank you for visiting Diwali Mela\n");
			}
		}
		while (choice == 'y');
	}
}	