package com.sample.design.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		DisplayList pl = new DisplayAdapter();
		pl.print(list);

	}
}