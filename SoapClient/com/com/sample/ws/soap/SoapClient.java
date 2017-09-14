package com.sample.ws.soap;

import static java.lang.System.out;

public class SoapClient {

	public static void main(String[] args) {
		HelloImplService service = new HelloImplService();
		Hello hello = service.getHelloImplPort();
		String name = hello.getHelloWorldAsString("Mohsin");
		out.println("Hi " + name);
	}

}
