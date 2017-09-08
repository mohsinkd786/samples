package com.sample.design.patterns.behavioral.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		StrategyContext context = new StrategyContext(new HeapSort());
		context.sort(numbers);
		

		// Change Strategy Algo
		// context = new StrategyContext(new MergeSort());
		// context.sort(numbers);
	}

}
