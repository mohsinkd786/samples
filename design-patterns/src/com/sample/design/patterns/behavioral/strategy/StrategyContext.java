package com.sample.design.patterns.behavioral.strategy;

public class StrategyContext {

	private final SortStrategy strategy;

	public StrategyContext(SortStrategy strategy) {
		this.strategy = strategy;
	}
	public void sort(int[] numbers){
		strategy.sort(numbers);
	}
	public void filter(Object obj){
		strategy.filter(obj);
	}
}
