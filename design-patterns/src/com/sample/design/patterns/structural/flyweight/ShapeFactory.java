package com.sample.design.patterns.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> shapes = new HashMap<>();

	public static Shape getShape(String label) {
		Shape concreteShape = (Shape) shapes.get(label);

		if (concreteShape == null) {
			if (label.equals("R")) {
				concreteShape = new Rectangle(label);
			} else if (label.equals("O")) {
				concreteShape = new Circle(label);
			}
			shapes.put(label, concreteShape);
		}
		return concreteShape;
	}
}