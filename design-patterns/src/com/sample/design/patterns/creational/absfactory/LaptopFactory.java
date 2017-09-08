package com.sample.design.patterns.creational.absfactory;

import com.sample.design.patterns.creational.factory.Device;
import com.sample.design.patterns.creational.factory.Laptop;

public class LaptopFactory implements AbstractDeviceFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public LaptopFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Device getDevice() {
		return new Laptop(ram, hdd, cpu);
	}
}
