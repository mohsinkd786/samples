package com.sample.design.patterns.structural.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Spring", "xyz");
		try {
			executor.execute("ls -ltr");
			executor.execute(" clear");

		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}