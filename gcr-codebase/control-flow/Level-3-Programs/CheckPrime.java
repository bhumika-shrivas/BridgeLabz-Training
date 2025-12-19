import java.util.Scanner;

public class CheckPrime
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int n = input.nextInt();
		
		boolean isPrime = false;
		for (int i=2; i<=n; i++)
		{
			if (n%i == 0)
			{
				break;
			}
			else
			{
				isPrime = true;
			}
		}
		if (isPrime)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		
		input.close();
	}
}