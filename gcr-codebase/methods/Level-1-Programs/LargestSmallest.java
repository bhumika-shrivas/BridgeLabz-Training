import java.util.Scanner;

public class LargestSmallest
{
	
	//method
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{
		int [] result = new int[2];
		
		//finding Largest
		if (number1>number2 && number1>number3)
		{
			int largest = number1;
			result[0] = largest;
		}
		else if (number2>number1 && number2>number3)
		{
			int largest = number2;
			result[0] = largest;
		}
		else if (number3>number1 && number3>number2)
		{
			int largest = number3;
			result[0] = largest;
		}
		
		//finding Smallest
		if (number1<number2 && number1<number3)
		{
			int smallest = number1;
			result[1] = smallest;
		}
		else if (number2<number1 && number2<number3)
		{
			int smallest = number2;
			result[1] = smallest;
		}
		else if (number3<number1 && number3<number2)
		{
			int smallest = number3;
			result[1] = smallest;
		}
		
		return result;
		
	}
	
	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int number1 = input.nextInt();
		System.out.print("Enter number2: ");
		int number2 = input.nextInt();
		System.out.print("Enter number3: ");
		int number3 = input.nextInt();
		
		int[] result = findSmallestAndLargest(number1, number2, number3);
		System.out.println("Largest = " +result[0]);
		System.out.println("Smallest = " +result[1]);
		input.close();
	}
}