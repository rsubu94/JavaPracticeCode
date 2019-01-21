package com.practice.clas;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;

	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog eat is called");
		chew();

	}

	public  void walk(int speed) {
		// super.move(speed);
		System.out.println("Move called from dog");
		// walk();
		super.move(speed);
	}

	public void run(int speed) {
		System.out.println("run");
		move(speed);
	}

	private void chew() {
		System.out.println("Chew method called");
	}

	private void walk() {
		System.out.println("Walk called");
	}

}
