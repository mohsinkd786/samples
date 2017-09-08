package com.sample.design.patterns.behavioral.command;

public class Laptop implements Device {

	@Override
	public void turnOn() {
		System.out.println("Laptop is Turned On");
	}

	@Override
	public void turnOff() {
		System.out.println("Laptop is Turned Off");
	}

	@Override
	public void restart() {
		System.out.println("Laptop is Restarted");
	}
}
