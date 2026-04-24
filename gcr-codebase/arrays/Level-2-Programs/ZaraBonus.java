import java.util.Scanner;

public class ZaraBonus{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Declare arrays
		double[] salary = new double[10];
		double[] yearsOfService = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		
		//Declare total variables
		double totalBonus = 0.0;
		double totalOldSalary = 0.0;
		double totalNewSalary = 0.0;
		
		//Take input for 10 employees
		for (int i =0; i < 10; i++) 
		{
			System.out.println("Enter details for employees " + (i+1));
			
			System.out.print("Salary: ");
			double sal = input.nextDouble();
			
			System.out.print("Years of service: ");
			double years = input.nextDouble();
			
			//Validation
			if (sal<=0 || years <=0) 
			{
				System.out.println("Invalid Input");
				i--;
				continue;
			}
			salary[i] = sal;
			yearsOfService[i] = years;
		}
		
		//Calculatte bonus and new salary
		for (int i = 0; i < 10; i++) 
		{
			if (yearsOfService[i]>5) 
			{
				bonus[i] = salary[i]*0.05;
			}
			else
			{
			bonus[i] = salary[i]*0.02;
			}
			newSalary[i] = salary[i] + bonus[i];
			
			//Update totals
			totalBonus += bonus[i];
			totalOldSalary += salary[i];
			totalNewSalary +=newSalary[i];
		}
		
		System.out.println("Total Old Salary: " + totalOldSalary);
		System.out.println("Total Bonus Payout: " + totalOldSalary);
		System.out.println("Total New Salary: " + totalNewSalary);
		
		input.close();
	}
}