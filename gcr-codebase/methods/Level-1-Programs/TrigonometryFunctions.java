import java.util.Scanner;

public class TrigonometryFunctions
{
	//method
	public double[] calculateTrigonometricFunctions(double angle)
	{
		double[] result = new double[3];
		double radians = Math.toRadians(angle);
		
		result[0] = Math.sin(radians);
		result[1] = Math.cos(radians);
		result[2] = Math.tan(radians);
		
		return result;
	}
		
	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter angle in degree: ");
		double angle = input.nextDouble();
		
		TrigonometryFunctions obj = new TrigonometryFunctions();
		double[] values = obj.calculateTrigonometricFunctions(angle);
		
		System.out.printf("Sin(%.2f) = %.4f%n", angle, values[0]);
        System.out.printf("Cos(%.2f) = %.4f%n", angle, values[1]);
        System.out.printf("Tan(%.2f) = %.4f%n", angle, values[2]);
		
		input.close();
	}
}