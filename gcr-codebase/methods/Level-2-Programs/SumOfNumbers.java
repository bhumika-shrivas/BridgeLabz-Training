import java.util.Scanner;

public class SumOfNumbers
{
	
	//method
	public static int sumUsingRecurssion(int n)
	{
		if (n == 0) 
		{
            return 0;
		}
		else 
		{
			return n + sumUsingRecurssion(n - 1);
		}
	}
	
	public static int sumUsingFormula(int n)
	{
		int result = n*(n+1)/2;
		return result;
	}
	
	public static void main(String [] args)
	{	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a natural number: ");
		int n = input.nextInt();
		
		if (n<=0){
			System.out.print("Enter a natural number");
			System.exit(0);
		}
		else
		{
			if (sumUsingRecurssion(n) == sumUsingFormula(n)){
				System.out.println("Results are same using recurssion and formula");
				System.out.print("Result: " + sumUsingFormula(n));
			
			}
			else
			{
				System.out.print("The results are not same using recurssion and formula");
			}
		}
		
		input.close();
	}
}