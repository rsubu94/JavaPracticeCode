package com.practice.factorypattern;

public class AbstractProducer {
	public static AbstractFactory getRelevant(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}

	}

}
