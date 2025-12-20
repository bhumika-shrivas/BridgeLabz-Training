import java.util.Scanner;

public class SimpleInterest
{
	//method
	public double simpleInterest(double p, double r, double t)
	{
		double interest = p*r*t;
		return interest;
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Principal: ");
		double principal = input.nextDouble();
		System.out.print("Enter Rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter time: ");
		double time = input.nextDouble();
		
		SimpleInterest si = new SimpleInterest();
		
		System.out.print("The Simple Interest is " + si.simpleInterest(principal, rate, time) + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		input.close();
	}
}