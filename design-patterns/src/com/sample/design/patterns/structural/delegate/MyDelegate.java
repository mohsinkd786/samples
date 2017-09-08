package com.sample.design.patterns.structural.delegate;

public class MyDelegate {

	private Service service;
	
	private UserService userService = new UserService();
	private EmpService empService = new EmpService();

	public void execute() {
		service.execute();
	}

	public String process() {
		return service.process();
	}

	public String getData() {
		if (service instanceof UserService) {
			return userService.getUsers();
		} else if (service instanceof EmpService) {
			return empService.getValue();
		}
		return null;
	}

}
