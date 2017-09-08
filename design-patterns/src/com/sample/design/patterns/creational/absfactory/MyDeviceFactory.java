package com.sample.design.patterns.creational.absfactory;

import com.sample.design.patterns.creational.factory.Device;

public class MyDeviceFactory {

	public static Device getDevice(AbstractDeviceFactory factory) {
		return factory.getDevice();
	}
}
