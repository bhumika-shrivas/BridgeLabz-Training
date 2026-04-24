import java.util.Scanner;

public class CheckArmstrong
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		int sum = 0;
		int originalNumber = number;
		
		while (originalNumber !=0)
		{
			int digit = originalNumber % 10;

            //Find cube of digit and add to sum
            sum = sum + (digit * digit * digit);

            //Remove last digit
            originalNumber = originalNumber / 10;
        }

        //Check Armstrong condition
        if (sum == number) 
		{
            System.out.println(number + " is an Armstrong Number");
        } 
		else 
		{
            System.out.println(number + " is NOT an Armstrong Number");
        }

        input.close();
    }
}