package com.sample.design.patterns.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Device device = DeviceFactory.getDevice("Desktop", "ram", "hdd", "cpu");
		System.out.println(device.toString());
	}
}
