package com.sample.ws.cxf;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class HelloPublisher {

	private HelloPublisher() {
		Hello helloWorld = new HelloImpl();
		// create WebService service factory
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		// register WebService interface
		factory.setServiceClass(Hello.class);
		// publish the interface
		factory.setAddress("http://localhost:9000/Hello");
		factory.setServiceBean(helloWorld);
		// create WebService instance
		factory.create();
	}

	public static void main(String[] args) throws InterruptedException {
		// now start the webservice server
		new HelloPublisher();
		//System.out.println("Server ready...");
		//Thread.sleep(1000 * 60);
		//System.out.println("Server exit...");
		//System.exit(0);
	}
}