import java.util.Scanner;

public class YoungestFriend{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int[] ages = new int[3];
		double[] heights = new double[3];
		int index = 0;
		
		System.out.print("Enter Amar age: ");
		int amarAge = input.nextInt();
		ages[index] = amarAge;
		System.out.print("Enter Amar height: ");
		double amarHeight = input.nextDouble();
		heights[index] = amarHeight;
		index++;
		
		System.out.print("Enter Akhbar age: ");
		int akhbarAge = input.nextInt();
		ages[index] = akhbarAge;
		System.out.print("Enter Akhbar height: ");
		double akhbarHeight = input.nextDouble();
		heights[index] = akhbarHeight;
		index++;
		
		System.out.print("Enter Anthony age: ");
		int anthonyAge = input.nextInt();
		ages[index] = anthonyAge;
		System.out.print("Enter Anthony height: ");
		double anthonyHeight = input.nextDouble();
		heights[index] = anthonyHeight;
		
		int youngest = ages[0];
		for (int i=1; i<ages.length; i++) 
		{
			if (ages[i]<youngest){
				youngest = ages[i];
			}
		}
		double tallest = heights[0];
		for (int j=1; j<heights.length; j++) 
		{
			if (heights[j]>tallest){
				tallest = heights[j];
			}
		}
		System.out.println("The youngest friend is: " + youngest);
		System.out.println("The tallest friend is: " + tallest);
		input.close();
	}
}
	