package com.sample.design.patterns.behavioral.template;

public class TemplateTest {

	public static void main(String[] args) {
		BuildingTemplate template = new HighRiseBuilding();
	
		template.buildHouse();

		// alternate
		// template = new LowRiseBuilding();
		// template.buildHouse();

	}

}
