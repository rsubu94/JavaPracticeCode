package com.practice.challenges;

public class Main {

	public static void main(String[] args) {
		Suzuki suz = new Suzuki();
		suz.steer(68);
		System.out.println("Velocity "+suz.getCurrentVelocity());
		suz.accelerate(45);
		System.out.println("Velocity "+suz.getCurrentVelocity());
		suz.accelerate(20);
		System.out.println("Velocity "+suz.getCurrentVelocity());
		suz.accelerate(-20);
		System.out.println("Velocity "+suz.getCurrentVelocity());
		suz.accelerate(0);

	}

}
