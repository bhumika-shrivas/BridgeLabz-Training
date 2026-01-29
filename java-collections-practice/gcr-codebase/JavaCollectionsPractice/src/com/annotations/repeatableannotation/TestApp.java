package com.annotations.repeatableannotation;

public class TestApp {

	@BugReport(description = "Null pointer issue")
    @BugReport(description = "UI not refreshing")
    public void runApp() {
        System.out.println("App is running...");
    }
}
