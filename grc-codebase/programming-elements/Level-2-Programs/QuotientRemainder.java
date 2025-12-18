import java.util.Scanner;

public class QuotientRemainder{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number1, number2;
		
		System.out.print("Enter number 1: ");
		number1=input.nextInt();
		System.out.print("Enter number 2: ");
		number2=input.nextInt();
		
		//Calculation quotient and remainder
		int quotient=number1/number2;
		int remainder=number1%number2;
		
		System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
		input.close();
	}
}