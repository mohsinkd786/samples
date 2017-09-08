package com.sample.design.patterns.creational.builder;

import static java.lang.System.out;

public class UserDirector {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("SPring", "People").address("Bellandur").age(10).phone("12345").build();

		Plane plane = new HelicopterBuilder()
				.init()
				.setName("My Plane")
				.setType()
				.setWings("White WIngs")
				.build();
		
		//out.println("Plane builder " + plane.name);
		
		out.println("User builder " + user1);
	}

	public User setUser(String fnam, String lnam, int age, String address, String phone) {
		return new User.UserBuilder(fnam, lnam).address(address).age(age).phone(phone).build();
	}
}