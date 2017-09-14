package com.sample.java.basic;

import java.util.StringTokenizer;

public class StringTokenExample {
	public static void main(String a[]) {
		String msg = "http://111.222.33.67:8080/";
		StringTokenizer st = new StringTokenizer(msg, "://.");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}