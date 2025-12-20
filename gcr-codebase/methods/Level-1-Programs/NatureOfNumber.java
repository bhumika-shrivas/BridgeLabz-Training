import java.util.Scanner;

public class NatureOfNumber
{
	//method
	public int Check(int n){
		if (n>0){
			return 1;
		}
		else if (n==0){
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		NatureOfNumber obj = new NatureOfNumber();
		int output = obj.Check(number);
		System.out.print("Nature of number: " + output);
		input.close();
	}
}