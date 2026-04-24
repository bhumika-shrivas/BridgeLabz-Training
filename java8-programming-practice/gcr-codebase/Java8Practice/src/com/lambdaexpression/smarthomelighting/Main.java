package com.lambdaexpression.smarthomelighting;

/*
 Smart Home Lighting Automation
○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
commands) need to execute different light patterns.
○ Task: Use lambdas to define these light activation behaviors dynamically without
creating multiple classes.
 */
public class Main {
	public static void main(String[] args) {
		LightPattern motion = () -> System.out.println("Lights ON on full brightness");
		
		LightPattern nightTime = () -> System.out.println("Lights ON on 30% brightness");
		
		LightPattern voiceCommand = () -> System.out.println("Switch lights to warm mode");
		
		SmartlightController.trigger(motion);
		SmartlightController.trigger(nightTime);
		SmartlightController.trigger(voiceCommand);
		
	}
}