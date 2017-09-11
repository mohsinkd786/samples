package com.sample;

import java.util.function.Supplier;

import com.sample.beans.Student;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<Student> supplier = () -> {
			return new Student(1, 30, "M", "Mohsin", "Khursheed");
		};
		Student std = supplier.get();
		System.out.println(std.toString());
	}

}
