package com.sample.design.patterns.creational.factory;

public class Desktop implements Device {

	@Override
	public String toString() {
		return "Desktop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

	private String ram;
	private String hdd;
	private String cpu;

	public Desktop(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}
