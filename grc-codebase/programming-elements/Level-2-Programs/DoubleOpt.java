import java.util.Scanner;

public class DoubleOpt{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double a,b,c;
		System.out.print("Enter the value of a: ");
		a=input.nextDouble();
		System.out.print("Enter the value of b: ");
		b=input.nextDouble();
		System.out.print("Enter the value of c: ");
		c=input.nextDouble();
		
		//Performing operations
		double operation1=a+(b*c);
		double operation2=(a*b)+c;
		double operation3=c+(a/b);
		double operation4=(a%b)+c;
		
		System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
		input.close();
		
	}
}	