import java.util.Scanner;

public class Handshakes{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int numberOfStudents;
		int combination;
		
		System.out.print("Enter the number of students: ");
		numberOfStudents=input.nextInt();
		combination=(numberOfStudents*(numberOfStudents-1))/2;
		
		System.out.println("The number of possible handshakes: " + combination);
		input.close();
	}
}