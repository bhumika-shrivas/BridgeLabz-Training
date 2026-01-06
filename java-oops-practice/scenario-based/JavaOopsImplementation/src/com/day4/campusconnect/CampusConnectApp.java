package com.day4.campusconnect;

public class CampusConnectApp 
{
	public static void main(String[] args)
	{
		Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@uni.edu");
		Course c1 = new Course("Java Programming", f1);
		
		Student s1 = new Student(1, "Aditi", "aditi@uni.edu");
		s1.addGrade(8);
		s1.addGrade(9);
		
		s1.enrollCourse(c1);
		
		s1.printDetails();
		f1.printDetails();
		c1.showCourseDetails();
	}
}
