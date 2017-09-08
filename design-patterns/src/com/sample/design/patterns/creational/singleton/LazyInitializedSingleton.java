package com.sample.design.patterns.creational.singleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}