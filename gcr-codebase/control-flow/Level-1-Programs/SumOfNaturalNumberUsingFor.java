import java.util.Scanner;

public class SumOfNaturalNumberUsingFor
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Take the user input number
		System.out.print("Enter a natural number: ");
		int n=input.nextInt();
		
		if (n <= 0) 
		{
            System.out.println("The number is not a natural number");
        } 
		else 
		{
            // Use for loop
            int sumByLoop = 0;
            for (int i = 1; i <=n; i++)
			{
			sumByLoop +=i;
			}

            // Use formula
            int sumByFormula = n * (n + 1) / 2;

            // Compare results
            System.out.println("Sum using for loop = " + sumByLoop);
            System.out.println("Sum using formula = " + sumByFormula);

            if (sumByLoop == sumByFormula) 
			{
                System.out.println("Both results are correct and equal");
            } 
			else 
			{
                System.out.println("Results are not equal");
            }
        }

        input.close();
    }
}