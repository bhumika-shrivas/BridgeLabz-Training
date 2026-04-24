import java.util.Scanner;

public class BMI
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight (in kg): ");
		double weight = input.nextDouble();
		System.out.print("Enter the height (in cm): ");
		double height = input.nextDouble();
		
		//Convert height in m^2
		height = height/100;
		
		//calculate BMI
		double bmi = weight / (height*height);
		
		//Determine weight status of a person
		if (bmi<=18.4)
		{
			System.out.print("Status: Underweight");
		}
		else if (bmi>=18.5 && bmi<=24.9)
		{
			System.out.print("Status: Normal");
		}
		else if (bmi>=25.0 && bmi<=39.9)
		{
			System.out.print("Status: Overweight");
		}
		else
		{
			System.out.print("Status: Obese");
		}
		input.close();
		
	}
}	