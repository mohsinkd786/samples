package com.sample.ws.cxf;

import javax.jws.WebService;

@WebService
public class HelloImpl implements Hello {
	public String sayHi(String name) {
		System.out.println("sayHello is called by " + name);
		return "Hello " + name;
	}

	public Emp getEmployee(String id) {
		System.out.println("getEmployee is called by " + id);
		Emp em = new Emp();
		em.id = Integer.valueOf(id);
		em.name = "Mohsin";

		return em;
	}
}