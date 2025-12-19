import java.util.Scanner;

public class CheckNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		System.out.println("Enter 5 numbers: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]==0)
			{
				System.out.println(arr[i]+ " is Zero");
			}
			else if (arr[i]<0)
			{
				System.out.println(arr[i]+ " is Negative Number");
			}
			else 
			{
				System.out.print(arr[i]+ " is Positive number");
				
				if (arr[i]%2 == 0)
				{
					System.out.println(" and even");
				}
				else
				{
					System.out.println(" and odd");
				}
			}
		}
		if (arr[0]>arr[4])
		{
			System.out.println("First element is greater than last element");
		}
		else if (arr[4]>arr[0])
		{
			System.out.println("Last element is greater than first element");
		}
		else
		{
			System.out.println("First and last element are same");
		}
		input.close();
	}
}