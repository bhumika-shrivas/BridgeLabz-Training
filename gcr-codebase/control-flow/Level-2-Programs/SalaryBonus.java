import java.util.Scanner;

public class SalaryBonus
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int salary, year;
		
		System.out.print("Enter the salary: ");
		salary=input.nextInt();
		System.out.print("Enter the years of service: ");
		year=input.nextInt();
		
		if (year<=5)
		{
			System.out.print("Not eligible for bonus");
		}
		else
		{
			double bonus=0.05*salary;
			System.out.print("Bonus amount: " + bonus);
		}
		input.close();
	}
}