package com.sample.design.patterns.behavioral.iterator;

public interface Iterator {
	public Animal nextAnimal();

	public boolean isLastAnimal();

	public Animal currentAnimal();
}