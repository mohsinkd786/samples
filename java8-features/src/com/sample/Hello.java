package com.sample;

import java.util.HashMap;
import java.util.Map.Entry;

import com.sample.beans.Employee;

import static java.lang.System.out;

public class Hello implements I {

	public static void main(String[] args) {

		I ii = new I() {
			@Override
			public void add(int i, int j) {
				System.out.println(i + j);
			}
		};
		ii.add(10, 2);

		HashMap<Employee, String> hm = new HashMap<Employee, String>();

		Employee e1 = new Employee(1, "Mohsin");
		Employee e2 = new Employee(2, "Asma");
		Employee e3 = new Employee(3, "Test");
		Employee e4 = new Employee(1, "New Mohsin");
		Employee e5 = new Employee(1, "Mohsin");

		hm.put(e1, "Employee 1");
		hm.put(e2, "Employee 2");
		hm.put(e3, "Employee 3");
		hm.put(e4, "Employee 4");
		hm.put(e5, "Employee 5");

		Employee ee1 = new Employee(1, "Mohsin");
		out.println("Employee " + hm.get(ee1));

		for (Entry<Employee, String> emp : hm.entrySet()) {
			// Employee ee1 = new Employee(1, "Mohsin");
			out.println("Values " + emp.getKey().getEmpName());
		} //

		// Functional Interface example
		Worker work = new Worker() {

			@Override
			public int evaluate(int a, int b) {
				return a * b;
			}
		};
		out.println("Functional Interface with Anonymous Class " + work.evaluate(10, 12));

		out.println("FI Default Method with Anonymous Class " + work.sum(10, 12));

		// Lambda Expression

		Worker wrk = (a, b) -> {
			if (a > b) {
				return a - b;
			} else {
				return a + b;
			}
		};
		out.println("Functional Interface with Lambda Function " + wrk.evaluate(12, 10));
	}

	@Override
	public void add(int i, int j) {
		out.println(i + j);
	}
}

interface I {
	void add(int i, int j);

	default int process(int i, int j) {
		return i * j;
	}

	static int reprocess(int i, int j) {
		return i * j;
	}
}
