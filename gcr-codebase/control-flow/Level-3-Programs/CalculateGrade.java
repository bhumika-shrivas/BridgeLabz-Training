import java.util.Scanner;

public class CalculateGrade
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int physics, chemistry, maths;
		
		//Taking input marks
		System.out.print("Enter Physics marks: ");
		physics=input.nextInt();
		System.out.print("Enter Chemistry marks: ");
		chemistry=input.nextInt();
		System.out.print("Enter Maths marks: ");
		maths=input.nextInt();
		
		//Calculate percentage and grade
		int percentage=(physics+chemistry+maths)/3;
		String grade;
		if (percentage>=80)
		{
			grade = "A";
			System.out.println("Average marks: " + percentage);
			System.out.println("Grade: " + grade);
			System.out.println("Level 4, above agency-normalized standards");
		}
		else if (percentage>=70 && percentage<=79)
		{
			grade = "B";
			System.out.println("Average marks: " + percentage);
			System.out.println("Grade: " + grade);
			System.out.println("Level 3, at agency-normalized standards");
		}
		else if (percentage>=60 && percentage<=69)
		{
			grade = "C";
			System.out.println("Average marks: " + percentage);
			System.out.println("Grade: " + grade);
			System.out.println("Level 2, below, but approaching agency-normalized standards");
		}
		else if (percentage>=50 && percentage<=59)
		{
			grade = "D";
			System.out.println("Average marks: " + percentage);
			System.out.println("Grade: " + grade);
			System.out.println("Level 1, well below agency-normalized standards");
		}
		else if (percentage>=40 && percentage<=49)
		{
			grade = "E";
			System.out.println("Average marks: " + percentage);
			System.out.println("Grade: " + grade);
			System.out.println("Level 1-, too below agency-normalized standards");
		}
		else
		{
			grade = "R";
			System.out.println("Average marks: " + percentage);
			System.out.println("Grade: " + grade);
			System.out.println("Remedial standards");
		}
		input.close();
	}
}