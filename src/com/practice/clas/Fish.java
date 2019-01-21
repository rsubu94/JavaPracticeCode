package com.practice.clas;

public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;

	public Fish() {
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	private void rest() {

	}

	private void moveMuscles() {

	}

	private void moveBackFin() {

	}

	private void swim(int swim) {
		super.move(swim);
		moveMuscles();
		moveBackFin();
	}

	@Override
	public void move(int sped) {
		// TODO Auto-generated method stub
		swim(sped);
		//super.move(sped);
	}
	
	

}
