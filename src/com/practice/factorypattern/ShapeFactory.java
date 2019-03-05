package com.practice.factorypattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getInstance(String shapeType) {
		if ("Rectangle".equalsIgnoreCase(shapeType))
			return new Rectangle();
		else if ("Square".equalsIgnoreCase(shapeType))
			return new Square();
		return null;
	}

}
