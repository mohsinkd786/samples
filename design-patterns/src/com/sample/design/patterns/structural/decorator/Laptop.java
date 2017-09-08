package com.sample.design.patterns.structural.decorator;

//concrete decorator
public class Laptop extends ComputerDecorator {

	public Laptop(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void build() {
		super.build();
		System.out.print("Laptop");
	}
}
