package com.practice.factorypattern;

public class ShapeMain {
	public static void main(String[] args) {
		AbstractFactory abstractProducer = AbstractProducer.getRelevant(false);
		System.out.println("abstrac " + abstractProducer);
		Shape shape = abstractProducer.getInstance("Rectangle");
		System.out.println(shape);
		shape.draw();
		shape = abstractProducer.getInstance("Square");
		shape.draw();
		abstractProducer = AbstractProducer.getRelevant(true);
		shape = abstractProducer.getInstance("Rectangle");
		shape.draw();
		shape = abstractProducer.getInstance("Square");
		shape.draw();

	}

}
