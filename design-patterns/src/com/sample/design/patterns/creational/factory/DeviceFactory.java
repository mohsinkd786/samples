package com.sample.design.patterns.creational.factory;

public class DeviceFactory {
	public static Device getDevice(String type, String ram, String hdd, String cpu) {
		if ("Laptop".equalsIgnoreCase(type))
			return new Laptop(ram, hdd, cpu);
		else if ("Desktop".equalsIgnoreCase(type))
			return new Desktop(ram, hdd, cpu);
//switch cases
		return null;
	}
}
