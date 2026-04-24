import java.util.Scanner;

public class BusAttendance
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[10];
		String[] attendance = new String[10];
		
		// Store names of students
		for (int i=0; i<names.length; i++)
		{
			System.out.println("Enter names of students: ");
			names[i] = input.next();
		}
		
		// Take Attendance
		System.out.println("Please say Present or Absent on name calls");
		for (int i=0; i<names.length; i++)
		{
			System.out.println("Call for " + names[i]);
			attendance[i] = input.next().toLowerCase();
		}
		
		int present = 0;
		int absent = 0;
			
		for (String status: attendance)
		{
			if (status.equals("present"))
			{
				present++;
			}
			else if (status.equals("absent"))
			{
				absent++;
			}
			else
			{
				System.out.println("Please respond to name call properly");	
				i--;
			}
		}
		
		//Show attendance record
		System.out.println("Total Present: " + present);
		System.out.println("Total Absent: " + absent);
		
		input.close();		
	}
}
		
		