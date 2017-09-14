package com.sample.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface Hello {
	//@WebResult(partName = "helloResponse")
	@WebMethod
	String getHelloWorldAsString(String name);

}