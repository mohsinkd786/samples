package com.sample.design.patterns.creational.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeePrototype emps = new EmployeePrototype();
		emps.loadData();

		// Use the clone method to get the Employee object
		EmployeePrototype empsNew = (EmployeePrototype) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Torque");
		
		
		EmployeePrototype empsNew1 = (EmployeePrototype) emps.clone();
		
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Ejbs");
		
		Runtime.getRuntime().gc();
		
		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
		System.out.println("emps List: " + emps.getEmpList());
	}

}