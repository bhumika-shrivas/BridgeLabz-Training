import java.util.Scanner;

public class VoteEligibility{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int age;
		
		System.out.print("Enter the age: ");
		age=input.nextInt();
		
		if (age>=18){
			System.out.print("The person's age is " + age + " and can vote.");
		}
		else {
			System.out.print("The person's age is " + age + " and cannot vote.");
		}
		input.close();
	}
}