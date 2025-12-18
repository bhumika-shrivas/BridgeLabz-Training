import java.util.Scanner;

public class TotalPrice{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int unitPrice, quantity;
		System.out.print("Enter the unit Price: ");
		unitPrice=input.nextInt();
		System.out.print("Enter the quantity bought: ");
		quantity=input.nextInt();
		
		//Calculating total price
		int totalPrice=unitPrice*quantity;
		
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + "and unit price is INR " + unitPrice);
		input.close();
	}
}