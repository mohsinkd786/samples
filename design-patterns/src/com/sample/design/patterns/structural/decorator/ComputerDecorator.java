package com.sample.design.patterns.structural.decorator;

//decorator
public class ComputerDecorator implements Device {

	protected Device device;

	public ComputerDecorator(Device device) {
		this.device = device;
	}

	@Override
	public void build() {
		this.device.build();
	}
}
