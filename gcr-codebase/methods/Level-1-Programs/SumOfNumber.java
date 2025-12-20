import java.util.Scanner;

public class SumOfNumber
{
	//method
	public static int sum(int n){
		int value = 0;
		if (n<=0){
			System.out.println("Enter a natural number");
			System.exit(0);
		}
		else
		{
			for (int i=1; i<=n; i++){
				value += i;
			}
		}
		return value;
		
	}
				
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.print("Sum: " + sum(n));
		input.close();
	}
}