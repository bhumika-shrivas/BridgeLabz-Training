package com.exceptions;

public class ExceptionPropagationDemonstration {

	// method1 throws exception
    static void method1() {
        int result = 10 / 0;   // ArithmeticException occurs here
    }

    // method2 does not handle, just calls method1
    static void method2() {
        method1();            // exception propagates to caller
    }

    public static void main(String[] args) {

        try {
            method2();        // exception reaches main
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
