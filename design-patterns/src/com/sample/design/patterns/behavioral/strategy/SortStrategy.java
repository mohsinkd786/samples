package com.sample.design.patterns.behavioral.strategy;

interface SortStrategy {
	void sort(int[] numbers);

	default void filter(Object obj) {

	}
}
