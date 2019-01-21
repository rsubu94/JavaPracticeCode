package com.practice.polymorphism;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe", "Cheicke", 345,"White");
		super.addHamburgerAddition1("Shamm", 945);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add");
	}
	
	
	
}
