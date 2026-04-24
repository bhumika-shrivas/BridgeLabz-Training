package com.reflection.advancelevel.loginproxy;

import java.lang.reflect.Proxy;

public class LoginProxyDemo {

	public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        Greeting original = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),              // Class loader
                new Class[]{Greeting.class},                  // Interfaces
                (proxyObj, method, methodArgs) -> {          // Invocation handler
                    System.out.println("Method called: " + method.getName()); // log method
                    return method.invoke(original, methodArgs); // call original method
                }
        );

        // User input for method argument
        System.out.print("Enter name to greet: ");
        String name = sc.nextLine();

        // Call method through proxy
        proxy.sayHello(name);

        sc.close();
    }
}
