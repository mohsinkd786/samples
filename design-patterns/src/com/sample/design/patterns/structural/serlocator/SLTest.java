package com.sample.design.patterns.structural.serlocator;

public class SLTest {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("EJBService");
		service.execute();
		System.out.println();
		service = ServiceLocator.getService("JMSService");
		service.execute();
		System.out.println();
		service = ServiceLocator.getService("EJBService");
		service.execute();
		System.out.println();
		service = ServiceLocator.getService("JMSService");
		service.execute();

	}

}
