import java.util.Scanner;

public class TriangleArea{
	public static void main(String[] args){
	
		Scanner input=new Scanner(System.in);
		double base, height;
		
		System.out.print("Enter the height of triangle in cm: ");
		height=input.nextDouble();
		System.out.print("Enter the base of triangle in cm: ");
		base=input.nextDouble();
		double AreaInCm=0.5*base*height;
		double AreaInInches=AreaInCm/2.54;
		
		System.out.println("The Area of triangle in cm is " + AreaInCm + " and in Inches " + AreaInInches);
		input.close();
	}
}