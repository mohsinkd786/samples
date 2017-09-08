package com.sample.design.patterns.behavioral.command;

public class Desktop implements Device {

	@Override
	public void turnOn() {
		System.out.println("Desktop is Turned On");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop is Turned Off");
	}

	@Override
	public void restart() {
		System.out.println("Desktop is Restarted");
	}
}
