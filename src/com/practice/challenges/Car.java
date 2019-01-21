package com.practice.challenges;

public class Car extends Vehicle {
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String size,int wheels,int doors,int gears,boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Currently car is in the "+currentGear+" gear");
	}
	
	public void changeGear(int currentGear)
	{
		this.currentGear =currentGear;
		System.out.println("Current Gear changed to "+currentGear);
	}
	
	public void changeVelocity(int speed,int direction)
	{
		System.out.println("Called from change velocity of car class with speed "+speed+ " and the direction "+direction);
		move(speed,direction);
	}


	

}
