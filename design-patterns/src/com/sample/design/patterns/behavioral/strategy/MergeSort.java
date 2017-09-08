package com.sample.design.patterns.behavioral.strategy;

public class MergeSort implements SortStrategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("Merge Sort ");
	}
}
