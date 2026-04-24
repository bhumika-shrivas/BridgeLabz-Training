import java.util.Scanner;

public class Height{
	public static void main(String[] args){
		
		double heightInCm;
		double heightInFeet;
		double heightInInches;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter height in cm: ");
		
		//Conversion of height in cm to inches and inches to feet
		heightInCm=input.nextDouble();
		heightInInches=heightInCm/2.54;
		heightInFeet=heightInInches/12;
		
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
		input.close();
	}
}