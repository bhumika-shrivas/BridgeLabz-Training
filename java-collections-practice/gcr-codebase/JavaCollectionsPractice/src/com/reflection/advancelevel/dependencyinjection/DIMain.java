package com.reflection.advancelevel.dependencyinjection;

public class DIMain {
	public static void main(String[] args) throws Exception {

		Service s = new Service();
		DIContainer.inject(s);
		s.run();
	}
}
