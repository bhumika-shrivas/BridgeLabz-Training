import java.util.Scanner;

public class QuotientRemainder
{
	
	//method
	public static int[] findRemainderAndQuotient(int number, int divisor)
	{
		int[] output = new int[2];
		int quotient = number/divisor;
		output[0] = quotient;
		int remainder = number%divisor;
		output[1] = remainder;
		return output;
	}
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int number1 = input.nextInt();
		System.out.print("Enter number2: ");
		int number2 = input.nextInt();
		int[] output = findRemainderAndQuotient(number1, number2);
		System.out.println("Quotient: " + output[0]);
		System.out.print("Remainder: " + output[1]);
		input.close();
	}
}