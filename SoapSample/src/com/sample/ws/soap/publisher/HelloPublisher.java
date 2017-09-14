package com.sample.ws.soap.publisher;

import javax.xml.ws.Endpoint;
import com.sample.ws.soap.HelloImpl;

//Endpoint publisher
public class HelloPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloImpl());
    }
}