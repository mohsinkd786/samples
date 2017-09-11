package com.sample;

@FunctionalInterface
public interface Worker {
	int evaluate(int a, int b);

	default int sum(int a, int b) {
		return a + b;
	}
}
