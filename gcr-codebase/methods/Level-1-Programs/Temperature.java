import java.util.Scanner;

public class Temperature
{
	
	//method
	public double calculateWindChill(double temperature, double windSpeed) 
	{
        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16);
        return windChill;
	}
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed: ");
		double windSpeed = input.nextDouble();
		Temperature obj = new Temperature();
		System.out.println("Wind Chill: " + obj.calculateWindChill(temperature, windSpeed));
		input.close();
	}
}