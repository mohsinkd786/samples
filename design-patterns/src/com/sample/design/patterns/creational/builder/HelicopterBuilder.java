package com.sample.design.patterns.creational.builder;

public class HelicopterBuilder {

	
	public Helicopter plane = new Helicopter();

	public HelicopterBuilder init(){
		plane = new Helicopter();
		return this;
	}
	public HelicopterBuilder setWings(String wings) {
		System.out.println("Set Wings");
		return this;
	}

	public HelicopterBuilder setName(String name) {
		plane.name = name;
		System.out.println("Name is " + name);
		return this;
	}

	public HelicopterBuilder setType() {
		plane.type = "Helicopter";
		System.out.println("Set Type");
		return this;
	}

	public Plane build() {
		
		return plane;
	}
}
