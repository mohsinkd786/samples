package com.sample.design.patterns.behavioral.template;

public class LowRiseBuilding extends BuildingTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Low Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Low Pillars");
	}
}
