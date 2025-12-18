import java.util.Scanner;

public class NumberCountDown{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int counter;
		
		System.out.print("Enter the value for count down: ");
		counter=input.nextInt();
		
		while (counter>=1) {
			System.out.println(counter);
			counter=counter-1;
		}
		
		input.close();
	}
}
			