package com.practice.factorypattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getInstance(String shapeType) {
		if ("Rectangle".equalsIgnoreCase(shapeType))
			return new RoundedRectangle();
		else if ("Square".equalsIgnoreCase(shapeType))
			return new RoundedSquare();
		return null;
	}

}
