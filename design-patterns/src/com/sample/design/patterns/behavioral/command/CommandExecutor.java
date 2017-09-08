package com.sample.design.patterns.behavioral.command;

public class CommandExecutor {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void press() {
		command.execute();
	}
}
