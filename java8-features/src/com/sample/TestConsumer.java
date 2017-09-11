package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		int x = 100;

		Consumer<Integer> myConsumer = (y) -> {
			System.out.println("x = " + x); // Statement A
			System.out.println("y = " + y);
		};

		myConsumer.accept(x);
		//
		List<Student> students = Arrays.asList(new Student("Mohsin", 1), new Student("Khursheed", 2));

		acceptAllStudents(students, e -> System.out.println(e.name));
		acceptAllStudents(students, e -> {
			e.gpa *= 1.5;
		});
		acceptAllStudents(students, e -> System.out.println(e.name + ": " + e.gpa));
	}

	public static void acceptAllStudents(List<Student> student, Consumer<Student> printer) {
		for (Student e : student) {
			printer.accept(e);
		}
	}

}

class Student {
	public String name;
	public double gpa;

	Student(String name, double g) {
		this.name = name;
		this.gpa = g;
	}
}