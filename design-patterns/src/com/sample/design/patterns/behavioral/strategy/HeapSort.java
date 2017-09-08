package com.sample.design.patterns.behavioral.strategy;

public class HeapSort implements SortStrategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("Heap Sort ");
	}
}
