import java.util.Scanner;

public class Distance{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int distanceInFeet;
		System.out.print("Enter the distance in feet: ");
		distanceInFeet=input.nextInt();
		
		//Conversion of distance from feet to yards and miles
		int distanceInYards=distanceInFeet*3;
		double distanceInMiles=distanceInYards/1760;
		
		System.out.println("The distance in feet, yards, and miles are " + distanceInFeet + ", " + distanceInYards + " and " + distanceInMiles);
		input.close();
	}
}
		