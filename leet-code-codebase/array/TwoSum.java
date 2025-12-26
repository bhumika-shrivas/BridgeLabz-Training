import java.util.Scanner;
import java.util.Arrays;

public class TwoSum{
	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the array: ");
		int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
		
		System.out.print("Enter the target: ");
		int target = input.nextInt();
		
		for (int i=0; i<nums.length; i++)
		{
			for (int j=i+1; j<nums.length; j++)
			{
				if (nums[i]+nums[j]==target)
				{
					System.out.println("Indices: [" + i + ", " + j + "]");
                    return;
				}
				else
				{
					System.out.print("TwoSum doesn't exist");
					System.exit(0);
				}
			}
		}
	}
}