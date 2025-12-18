import java.util.Scanner;

public class FactorialUsingFor
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Take user input
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		int fact=1;
		
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		
		System.out.print("Factorial : " + fact);
		input.close();
	}
}