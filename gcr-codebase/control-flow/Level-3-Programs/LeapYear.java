import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		//Check if Gregorian calender
		if (year<1582)
		{
			System.out.println("Enter a year >= 1582");
		}
		else
		{
			if (year % 400 == 0)
			{
				System.out.println(year + " is a leap year");
			}
			else if (year % 100 == 0)
			{
				System.out.println(year + " is not a leap year");
			}
			else if (year%4 == 0)
			{
				System.out.println(year + " is a leap year");
			}
			else
			{
				System.out.println(year + " is not a leap year");
			}
		}
		input.close();
	}
}
	