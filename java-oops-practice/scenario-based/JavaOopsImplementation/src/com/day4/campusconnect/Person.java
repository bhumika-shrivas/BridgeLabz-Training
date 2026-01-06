package com.day4.campusconnect;

// Base class
abstract class Person 
{
	protected String name;
	protected String email;
	protected int id;
	
	Person(int id, String name, String email)
	{
		this.name = name;
		this.email = email;
		this.id = id;
	}
	abstract void printDetails();
}
