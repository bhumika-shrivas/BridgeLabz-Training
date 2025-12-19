import java.util.Scanner;

public class CheckHarshadNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int number = input.nextInt();
		int sum = 0;
		int originalNumber = number;

        //Find sum of digits using while loop
        while (originalNumber != 0) {
            int digit = originalNumber % 10;                // get last digit
            sum = sum + digit;                             // add digit to sum
            originalNumber = originalNumber / 10;         // remove last digit
        }

        //Check Harshad condition
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }

        input.close();
    }
}