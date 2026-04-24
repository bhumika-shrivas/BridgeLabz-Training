import java.util.Scanner;

public class Handshakes
{
	//method
	public static int calculateHandshake(int n){
		int combination =  (n * (n - 1)) / 2;
		return combination;
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.print("Number of possible handshakes: " + calculateHandshake(numberOfStudents));
		
		input.close();
	}
}
		