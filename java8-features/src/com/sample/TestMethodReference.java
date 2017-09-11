package com.sample;

import static java.lang.System.out;

import java.util.function.BiFunction;

interface II {
	void hi();
}

public class TestMethodReference {

	public void hello() {
		out.println("Hello how r u");
	}

	public static void hey() {
		out.println("Hey! Wasssup");
	}

	public static void main(String[] args) {
		// creating the object
		TestMethodReference methodRef = new TestMethodReference();
		// Referring non-static method via reference
		II nonstatic = methodRef::hello;
		// calling interface method
		nonstatic.hi();
		// making use of static reference
		II staticRef = TestMethodReference::hey;
		staticRef.hi();

		// Predefined F.I.

		BiFunction<Integer, Integer, Integer> summer = Calculator::sum;
		// multiple methods
		BiFunction<Float, Float, Float> multiply = Calculator::mult;
		// via instance
		BiFunction<Integer, Integer, Float> division = new Calculator()::div;

		out.println("Sum is " + summer.apply(10, 32));
		out.println("Multiplication is " + multiply.apply(9.0f, 3.0f));
		out.println("Division is " + division.apply(27, 3));

	}
}

class Calculator {
	public float div(int i, int j) {
		return i / j;
	}

	public static int sum(int i, int j) {
		return i + j;
	}

	public static float mult(float i, float j) {
		return i * j;
	}
}
