package com.annotations.intermediatelevel.loggingmethodexecution;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Class (default access, not public)
class TestExecution {
    @LogExecutionTime
    void fastMethod() {
        int sum = 0; for(int i=0;i<1000;i++) sum+=i;
    }

    @LogExecutionTime
    void slowMethod() {
        try { Thread.sleep(500); } catch(Exception e) {}
    }
}

// Main class must be public if file is named Main.java
public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        TestExecution obj = new TestExecution();
        for(Method m : TestExecution.class.getDeclaredMethods()) {
            if(m.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println("Running: " + m.getName());
                long start = System.nanoTime();
                m.invoke(obj);
                long end = System.nanoTime();
                System.out.println("Execution time: " + (end-start) + " ns\n");
            }
        }
    }
}
