import java.util.Scanner;

public class CheckDivisibility{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int number;
		System.out.print("Enter the number: ");
		number=input.nextInt();
		
		System.out.print(" Is the number " + number + " divisible by 5? " + (number%5==0));
		input.close();
	}
}