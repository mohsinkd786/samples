package com.sample.design.patterns.structural.decorator;

//Component Impl
public class Computer implements Device {

	@Override
	public void build() {
		System.out.println("Computer");
	}
}
