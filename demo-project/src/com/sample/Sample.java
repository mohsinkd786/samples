package com.sample;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {

		sampleForEachList();
		sampleForEachMap();
	}

	static void sampleForEachList() {
		List<String> items = new ArrayList<>();
		items.add("One");
		items.add("Two");
		items.add("Three");
		items.add("Four");
		items.add("Five");

		// Conventional Way
		for (String item : items) {
			out.println(item);
		}

		// Java 8 Foreach
		items.forEach(item -> out.print(item));

		// Java 8
		items.forEach(item -> {
			if ("Two".equalsIgnoreCase(item)) {
				out.println("Item located");
			}
		});

		
		
		
		
		
		
		
		// Method Reference
		items.forEach(out::println);
	}

	static void sampleForEachMap() {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		// Java 8
		items.forEach((k, v) -> out.println("Item : " + k + " Count : " + v));

		// Java 8
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				out.println("Hello E");
			}
		});
	}
}
