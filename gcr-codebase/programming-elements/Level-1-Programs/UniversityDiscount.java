import java.util.Scanner;

public class UniversityDiscount{
	public static void main(String[]  args){
		
		double fee;
		double discountPercent;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter fee: ");
		fee=input.nextDouble();
		System.out.println("Enter discount percent: ");
		discountPercent=input.nextDouble();
		double discount=(fee*discountPercent)/100;
		double finalFee=fee-discount;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
		input.close();
	}
}