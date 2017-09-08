package com.sample.design.patterns.creational.singleton;

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
	public void hello(){
		System.out.println("Hello");
	}
}
