package com.sample.design.patterns.structural.decorator;

//concrete decorator
public class Desktop extends ComputerDecorator {

	public Desktop(Device device) {
		super(device);
	}

	@Override
	public void build() {
		super.build();
		System.out.print("Desktop");
	}
}
