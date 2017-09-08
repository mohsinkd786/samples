package com.sample.design.patterns.structural.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Device desktop = new Desktop(new Computer());
		desktop.build();

		System.out.println("\n");
		Device laptop = new Laptop(new Computer());
		laptop.build();
	}
}
