import java.util.Scanner;

public class CheckLargest{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int number1, number2, number3;
		
		//Taking inputs
		System.out.print("Enter the first number: ");
		number1=input.nextInt();
		System.out.print("Enter the second number: ");
		number2=input.nextInt();
		System.out.print("Enter the third number: ");
		number3=input.nextInt();
		
		System.out.println("Is the first number the largest? " + (number1>number2 && number1>number3));
		System.out.println("Is the second number the largest? " + (number2>number1 && number2>number3));
		System.out.println("Is the third number the largest? " + (number3>number1 && number3>number2));
		input.close();
	}
}