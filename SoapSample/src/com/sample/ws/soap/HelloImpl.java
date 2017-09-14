package com.sample.ws.soap;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.sample.ws.soap.Hello")
public class HelloImpl implements Hello{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World " + name;
	}
}