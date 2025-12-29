import java.util.Scanner;

public class NumberGuessGame
{
	static int thoughtNumber = 1 + (int)(Math.random() * ((100 - 1) + 1));
	static int count = 0;
	
	public static void guess(int guessedNum, int thoughtNumber)
	{
		if (guessedNum < thoughtNumber)
				{
					System.out.println("Too Low");
				}
				
				else if (guessedNum > thoughtNumber)
				{
					System.out.println("Too High");
				}
				
				else 
				{
					System.out.println("Hurray! Your guess is correct.");
				}
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Computer has thought a number");
		
		do
		{
			System.out.println("Guess the number: ");
			int guessedNum = input.nextInt();
			guess(guessedNum, thoughtNumber);
			count++;
		}
		
		while (count<5);
		
		System.out.println("Sorry, You lost the game. The number was: " + thoughtNumber);
		
		input.close();
	}
}