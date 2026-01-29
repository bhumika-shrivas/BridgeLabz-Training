package com.reflection.advancelevel.methodexecutiontiming;

public class TestClass {

	public void doSomething() throws InterruptedException {
        Thread.sleep(500); // simulate work
        System.out.println("Work done");
    }
}
