import java.util.Scanner;

public class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		
		if (n<=0)
		{
			System.out.print("Enter a natural number");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				String value;
				if (i%2==0)
				{
					value = "Even";
				}
				else
				{
					value = "Odd";
				}
				System.out.println(i + " is " + value);
			}
		}
		input.close();
	}
}