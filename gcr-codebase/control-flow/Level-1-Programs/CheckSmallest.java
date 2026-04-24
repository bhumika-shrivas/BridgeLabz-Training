import java.util.Scanner;

public class CheckSmallest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number1, number2, number3;
		
		System.out.print("Enter number 1: ");
		number1=input.nextInt();
		System.out.print("Enter number 2: ");
		number2=input.nextInt();
		System.out.print("Enter number 3: ");
		number3=input.nextInt();
		
		System.out.print("Is the first number the smallest? " + ((number1<number2) && (number1<number3)));
		input.close();
		
	}
}	