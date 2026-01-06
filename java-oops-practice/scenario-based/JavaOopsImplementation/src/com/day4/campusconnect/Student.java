package com.day4.campusconnect;

class Student extends Person implements ICourseActions
{
	private int[] grades;
	private int gradeCount = 0;
	
	Student(int id, String name, String email)
	{
		super(id, name, email);
		grades = new int[5];
	}
	
	void addGrade(int grade)
	{
		if (gradeCount < grades.length)
		grades[gradeCount++] = grade;	
	}
	
	double CalculateGPA()
	{
		int sum = 0;
		for (int i = 0; i < gradeCount; i++)
			sum += grades[i];
		return gradeCount == 0 ? 0 : (double) sum / gradeCount;
	}
	
	public void enrollCourse(Course course)
	{
		course.addStudent(this);
	}
	
	public void dropCourse(Course course)
	{
		course.removeStudent(this);
	}
	
	@Override
	void printDetails()
	{
		System.out.println("Student: " + name + " GPA: " + CalculateGPA());
	}
}
