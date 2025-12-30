/*Record temperatures of 7 days of week.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.*/

import java.util.Scanner;

public class TemperatureLogger
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] temperature = new int[7];
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		// Store temperature of 7 days
		for (int i=0; i<days.length; i++)
		{
			System.out.println("Please enter the temperature for " + days[i] + ": ");
			temperature[i] = input.nextInt();
		}
		
		// Average of temperature
		int sum = 0;
		for (int i=0; i<days.length; i++)
		{
			sum+=temperature[i];
		}
		
		int avg = sum/7;
		
		// Maximum Temperatue
		int max = temperature[0];
		for (int i=1; i<temperature.length; i++)
		{
			if (temperature[i]>max)
			{
				max = temperature[i];
			}
		}
		
		System.out.println("Average of temperatures: " + avg);
		System.out.println("Maximum of temperatures: " + max);
		
		input.close();
	}
}