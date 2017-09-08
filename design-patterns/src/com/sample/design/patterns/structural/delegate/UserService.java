package com.sample.design.patterns.structural.delegate;

public class UserService implements Service {

	@Override
	public void execute() {
		System.out.println("User");
	}

	@Override
	public String process() {
		return "user process";
	}

	public String getUsers() {
		return "User";
	}
}
