package com.practice.clas;

public class Main {

	public static void main(String[] args) {
//		Car porsche = new Car();
//		Car rolls = new Car();
//		//porsche.model = "C456";
//		porsche.setModel("C344");
//		System.out.println(porsche.getModel());

		Animal ani = new Animal("Animal", 1, 1, 5, 5);

		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		dog.eat();
		dog.move(5);
		dog.walk(10);
		
		Animal fish = new Fish();
		fish = dog;
		fish.eat();
	}

}
