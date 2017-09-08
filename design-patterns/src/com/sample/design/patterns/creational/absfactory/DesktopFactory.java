package com.sample.design.patterns.creational.absfactory;

import com.sample.design.patterns.creational.factory.Desktop;
import com.sample.design.patterns.creational.factory.Device;

public class DesktopFactory implements AbstractDeviceFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public DesktopFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Device getDevice() {
		return new Desktop(ram, hdd, cpu);
	}
}
