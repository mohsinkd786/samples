package com.sample.design.patterns.behavioral.command;

public class CommandTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutor();

		//Entity
		Desktop desktop = new Desktop();

		//Command
		Command turnOn = new TurnOnCommand(desktop);
		
		//turnOn.execute();


		// turn on
		executor.setCommand(turnOn);
		executor.press();
		
		
		
		
		
		
		
		Command turnOff = new TurnOffCommand(desktop);
		//turnOff.execute();
		// turn off
		executor.setCommand(turnOff);
		executor.press();

	}
}
