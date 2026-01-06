package com.day4.campusconnect;

class Course 
{
	private String courseName;
	private Faculty faculty;
	private Student[] students = new Student[10];
	private int count = 0;
	
	Course(String courseName, Faculty faculty)
	{
		this.courseName = courseName;
		this.faculty = faculty;
	}
	
	void addStudent(Student s)
	{
		students[count++] = s;
	}
	
	void removeStudent(Student s)
	{
		for (int i = 0; i < count; i++)
		{
			if (student[i] == s)
			{
				students[i] = students[count - 1];
				count--;
				break;
			}
		}
	}
	void showCourseDetails()
	{
		System.out.println("Course: " + courseName);
		faculty.printDetails();
	}
}
