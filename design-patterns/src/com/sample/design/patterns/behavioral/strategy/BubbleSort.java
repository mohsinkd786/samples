package com.sample.design.patterns.behavioral.strategy;

public class BubbleSort implements SortStrategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("Bubble Sort ");
	}
}
