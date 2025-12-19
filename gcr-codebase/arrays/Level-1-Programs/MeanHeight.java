import java.util.Scanner;

public class MeanHeight
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		double [] heights = new double[11];
		double sum = 0;
		System.out.println("Enter the height of players: ");
		for (int i=0; i<heights.length-1; i++)
		{
			heights[i]=input.nextDouble();
			sum = sum + heights[i];
		}
		System.out.print("Mean height: " + (sum/11));
		
		input.close();
	}
}