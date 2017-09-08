package com.sample;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String args[]) {

		streamBuilder();
		streamToCollection();
		parellelStreams();
		filterDistinct();
		filterDistinctByObjectValue();
	}

	static void streamBuilder() {
		Stream<Date> stream = Stream.generate(() -> {
			return new Date();
		});
		// stream.forEach(p -> out.println(p));

		//
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//stream1.forEach(p -> out.println(p));
		
		stream1.forEach(out::println);
		//
	}

	static void streamToCollection() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0) .collect(Collectors.toList());
		out.println(evenNumbersList);
	}

	static void parellelStreams() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		// Here creating a parallel stream
		Stream<Integer> stream = list.parallelStream();
		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		out.println(evenNumbersArr);
	}

	static void filterDistinct() {
		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		// Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		// Let's verify distinct elements
		out.println(distinctElements);
	}

	static void filterDistinctByObjectValue() {
		Person one = new Person(1, "Brad", "Pitt");
		Person two = new Person(2, "Matt", "Daemon");
		Person three = new Person(3, "George", "Clooney");

		// Add some random persons
		Collection<Person> list = Arrays.asList(one, two, three, one, two, three, one);

		// Get distinct only
		List<Person> distinctElements = list.stream().filter(distinctByKey(p -> p.getId()))
				.collect(Collectors.toList());

		// Let's verify distinct elements
		out.println(distinctElements);
	}

	static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}

class Person {
	public Person(Integer id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	private Integer id;
	private String fname;
	private String lname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
}
