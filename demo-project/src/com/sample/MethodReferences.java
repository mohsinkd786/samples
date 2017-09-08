package com.sample;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReferences {

	public static void main(String[] args) {
		staticMethod();
		instanceMethod();
		classInstanceMethod();
		newKeyword();
	}

	// class : static method reference
	static void staticMethod() {
		List<Integer> integers = Arrays.asList(1, 12, 433, 5);
		Optional<Integer> max = integers.stream().reduce(Math::max);
		max.ifPresent(value -> out.println(value));
	}

	// class instance : instance method
	static void instanceMethod() {
		List<Integer> integers = Arrays.asList(1, 12, 433, 5);
		Optional<Integer> max = integers.stream().reduce(Math::max);
		max.ifPresent(out::println);
	}

	// class : instance method
	static void classInstanceMethod() {
		List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six");
		List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		out.println(sorted);
		List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		out.println(sortedAlt);
	}

	// class new keyword
	static void newKeyword() {
		List<Integer> integers = IntStream.range(1, 100).boxed().collect(Collectors.toCollection(ArrayList::new));
		Optional<Integer> max = integers.stream().reduce(Math::max);
		max.ifPresent(out::println);
	}

}
