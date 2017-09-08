package com.sample.design.patterns.behavioral.command;

public class Tab implements Device {

	@Override
	public void turnOn() {
		System.out.println("Tab is Turned On");
	}

	@Override
	public void turnOff() {
		System.out.println("Tab is Turned Off");
	}

	@Override
	public void restart() {
		System.out.println("Tab is Restarted");
	}
}
