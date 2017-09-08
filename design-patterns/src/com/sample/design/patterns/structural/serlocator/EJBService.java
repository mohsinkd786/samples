package com.sample.design.patterns.structural.serlocator;

public class EJBService implements Service {

	@Override
	public void execute() {
		System.out.println("Executing EJBService");
	}

	@Override
	public String getName() {
		return "EJBService";
	}

}
