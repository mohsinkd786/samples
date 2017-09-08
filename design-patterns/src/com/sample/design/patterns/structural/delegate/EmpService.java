package com.sample.design.patterns.structural.delegate;

public class EmpService implements Service {

	@Override
	public void execute() {
		System.out.println("Execute Method Emp");
	}

	@Override
	public String process() {
		return "process";
	}

	public String getValue() {
		return "EMP";
	}
}
