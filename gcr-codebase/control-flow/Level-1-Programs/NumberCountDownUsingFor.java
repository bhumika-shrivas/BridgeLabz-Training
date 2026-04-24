import java.util.Scanner;

public class NumberCountDownUsingFor{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int counter;
		
		System.out.print("Enter the value for count down: ");
		counter=input.nextInt();
		
		for (int i=counter; i>=1; i--) {
			System.out.println(i);
		}
		
		input.close();
	}
}