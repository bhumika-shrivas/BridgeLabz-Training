import java.util.Scanner;

public class Copy2DTo1D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Create 2D array from user input
		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = input.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
		System.out.println("Enter matrix elements: ");
		for (int i =0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				matrix[i][j] = input.nextInt();
			}
		}
		
		//Create 1D array
		int[] array = new int[rows * columns];
		int index = 0;
		
		//Copy every element of 2D array into 1D array
		for (int i = 0; i < rows; i++)
		{
			for (int j =0; j < columns; j++)
			{
				array[index] = matrix[i][j];
				index++;
			}
		}
		
		System.out.println("1D Array: ");
		for (int i =0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		input.close();
	}
}
		