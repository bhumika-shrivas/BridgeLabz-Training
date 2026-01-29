package com.reflection.advancelevel.dependencyinjection;

public class Service {
	@Inject
	Helper helper;

	void run() {
		helper.help();
	}
}
