package com.lambdaexpression.smarthomelighting;

// executes behavior 
public class SmartlightController {
	public static void trigger(LightPattern voiceCommand) {
		voiceCommand.activate();
	}
}
