package com.sample.java.basic;

import java.util.HashMap;
import java.util.Set;

public class MapSample {
	public static void main(String a[]) {
		HashMap<String, String> hm = new HashMap<String, String>();
		// add key-value pair to hashmap
		hm.put("first", "FIRST ");
		hm.put("second", "SECOND ");
		hm.put("third", "THIRD ");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println("Value of " + key + " is: " + hm.get(key));
		}
	}
}