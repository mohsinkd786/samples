package com.sample.design.patterns.behavioral.command;

public class RestartCommand implements Command {

	private Device device;

	public RestartCommand(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.restart();
	}
}
