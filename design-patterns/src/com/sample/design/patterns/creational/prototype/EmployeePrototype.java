package com.sample.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
//Cloning with Deep copy 

public class EmployeePrototype implements Cloneable {

	private List<String> empList;
	//private Address address;

	public EmployeePrototype() {
		empList = new ArrayList<String>();
	}

	public EmployeePrototype(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		// read all employees
		empList.add("Spring");
		empList.add("Struts");
		empList.add("Play");
		empList.add("Ejbs");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new EmployeePrototype(temp);
	}

}
