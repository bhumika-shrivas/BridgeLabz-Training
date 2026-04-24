import java.util.Scanner;

public class LeapYearLogical 
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year >= 1582) 
		{
            // Single if using combined logical conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			{
                System.out.println(year + " is a Leap Year");
            } 
			else 
			{
                System.out.println(year + " is NOT a Leap Year");
            }
        } 
		else 
		{
            System.out.println("Invalid Input! Leap year calculation works only for year >= 1582");
        }
    }
}
