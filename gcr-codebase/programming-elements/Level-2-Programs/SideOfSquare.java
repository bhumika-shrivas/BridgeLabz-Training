import java.util.Scanner;

public class SideOfSquare{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int perimeter;
		System.out.print("Enter the perimeter: ");
		perimeter=input.nextInt();
		int side=perimeter/4;
		
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close();
	}
}