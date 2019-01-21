package com.practice.polymorphism;

public class MainChal {
	
	public static void main(String s[])
	{
		Hamburger ham = new Hamburger("Basic", "Mutton", 234.5d, "wheat");
		ham.addHamburgerAddition1("sauce", 34.5d);
		Double totalAmount = ham.totalPrice();
		System.out.println(totalAmount);
		
		HealthyBurger health = new HealthyBurger("Brown",890.4);		
		health.addHealthyAddition1("Egg",789);
		health.addHealthyAddition2("Eff",23);
		System.out.println(health.totalPrice());
		
		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition1("ets", 568);
		db.totalPrice();
		

	}

}

