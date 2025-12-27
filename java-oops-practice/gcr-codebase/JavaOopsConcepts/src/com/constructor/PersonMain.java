package com.constructor.level1;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("Arya", 21);
        Person p2 = new Person(p1);   // copying p1

        p1.display();
        p2.display();
	}

}
