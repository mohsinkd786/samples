package com.sample.ws.soap.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.sample.ws.soap.Hello;

public class HelloClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://soap.ws.sample.com/", "HelloImplService");
		Service service = Service.create(url, qname);
		Hello hello = service.getPort(Hello.class);

		System.out.println(hello.getHelloWorldAsString("Mohsin"));
	}
}
