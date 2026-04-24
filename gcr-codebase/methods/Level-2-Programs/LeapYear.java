import java.util.Scanner;

public class LeapYear
{
	
	//method
	public static boolean isLeapYear(int year)
	{
		if (year>=1582 && ((year%4 ==0 && year % 100 != 0) || (year % 400 ==0)))
		{
			return true;
		}
		return false;
	}		
	
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year to check: ");
		int year = input.nextInt();
		
		if (isLeapYear(year))
		{
			System.out.println(year + " is a Leap Year");
		}
		else
		{
			System.out.println(year + " is not a Leap Year");
		}
		input.close();
	}
}