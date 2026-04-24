import java.util.Scanner;

public class Factorial
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Take user input
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		int fact=1;
		
		if (n<=0)
		{
			System.out.print("Enter a positive value");
		}
		else
		{
			while (n>1)
			{
				fact=fact*n;
				n--;
			}
		}
		
		System.out.print("Factorial : " + fact);
		input.close();
	}
}