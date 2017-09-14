package com.sample.boot.demo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.boot.demo.beans.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/list")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "User", "Name", "sampleuser@gmail.com"));
		return employeesList;
	}

	@RequestMapping(value = "/emps", method = RequestMethod.POST)
	public List<Employee> getAllEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "User", "Name", "sampleuser@gmail.com"));
		return employeesList;
	}

}
