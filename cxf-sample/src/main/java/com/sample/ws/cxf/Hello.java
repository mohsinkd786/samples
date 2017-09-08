package com.sample.ws.cxf;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Hello {
	// @WebParam is optional
	String sayHi(@WebParam(name = "text") String text);

	Emp getEmployee(String id);
}
