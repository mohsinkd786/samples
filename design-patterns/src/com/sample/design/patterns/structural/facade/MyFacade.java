package com.sample.design.patterns.structural.facade;

public class MyFacade {

	private ServiceAPI serviceAPI = new ServiceAPI();
	private UserServiceAPI userServiceAPI = new UserServiceAPI();

	public void userAdd() {
		userServiceAPI.addUser();
	}

	public void userDelete() {
		userServiceAPI.removeUser();
	}

	public void validate() {
		serviceAPI.validate();
	}

	public void verify() {
		serviceAPI.verify();
	}
}
