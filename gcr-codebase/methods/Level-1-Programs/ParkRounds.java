import java.util.Scanner;

public class ParkRounds
{
	//method
	public static double rounds(double side1, double side2, double side3){
		double perimeter = side1+side2+side3;
		int distance = 5000;
		double round = perimeter/distance;
		return round;
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int sides=3;
		
			
		System.out.print("Enter side1: ");
		double side1 = input.nextDouble();
		sides--;
		System.out.print("Enter side2: ");
		double side2 = input.nextDouble();
		sides--;
		System.out.print("Enter side3: ");
		double side3 = input.nextDouble();
		sides--;
		
		System.out.printf("Rounds needed to complete 5 km run: "+ rounds(side1, side2, side3));
		input.close();
	}

}
