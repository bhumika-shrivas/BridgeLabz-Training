import java.util.Scanner;

public class CheckNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter the number: ");
		number=input.nextInt();
		
		if (number>0){
			System.out.print("Positive");
		}
		if (number<0){
			System.out.print("Negative");
		}
		if (number==0) {
			System.out.print("Zero");
		}
		
		input.close();
	}
}