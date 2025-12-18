import java.util.Scanner;

public class SumOfNaturalNumbers{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int number, sum;
		
		System.out.print("Enter the number: ");
		number=input.nextInt();
		
		if (number>0){
			sum=number*(number+1)/2;
			System.out.print("The sum of " + number + " natural numbers is " + sum);
		}
		else {
			System.out.print("The number " + number + " is not a natural number");
		}
		input.close();
	}
}
