import java.util.Scanner;

public class Table
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int [] multiplicationResult = new int[4];
		
		int index=0;
		for(int i=6; i<10; i++)
		{
			multiplicationResult[index] = number * i;
			System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
			index++;
		}
		input.close();
	}
}