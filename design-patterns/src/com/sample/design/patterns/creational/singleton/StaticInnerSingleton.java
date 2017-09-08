package com.sample.design.patterns.creational.singleton;

public class StaticInnerSingleton {

	//bill pugh design for optimum thread safe 
	private StaticInnerSingleton() {
	}

	private static class SingletonHelper {
		private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
	}

	public static StaticInnerSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}