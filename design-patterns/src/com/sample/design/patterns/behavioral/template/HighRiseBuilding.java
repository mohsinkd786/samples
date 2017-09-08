package com.sample.design.patterns.behavioral.template;

public class HighRiseBuilding extends BuildingTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building High Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building High Pillars");
	}
}
