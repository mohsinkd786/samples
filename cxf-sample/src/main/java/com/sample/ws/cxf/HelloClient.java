package com.sample.ws.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class HelloClient {

	public static void main(String[] args) {
		// create WebService client proxy factory
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		// register WebService interface
		factory.setServiceClass(Hello.class);
		// set webservice publish address to factory.
		factory.setAddress("http://localhost:9000/Hello");
		Hello hello = (Hello) factory.create();
		System.out.println("invoke webservice...");
		System.out.println("message context is:" + hello.sayHi("Mohsin"));
		// System.exit(0);
		Emp mp = hello.getEmployee("001");
		System.out.println("message context is:" + mp.id + ": Name :" + mp.name);
	}
}
