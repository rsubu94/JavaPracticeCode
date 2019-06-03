package com.practice.java;

class MethodOverride {
	public void display() {
		System.out.println("Method created in Methodoverride display");
	}

	public void display1() {
		System.out.println("Method created in Methodoverride display 1");
	}

	public void dis5() {
		System.out.println("ds5");
	}
}

class A extends MethodOverride {
	public void display() {

		System.out.println("Method created in A display ");
		super.display();
	}

	public void display2() {
		System.out.println("Method created in A display 2");
	}
}

class B extends A {
	public void display4() {

		System.out.println("Method created in B display ");
		super.display();
	}

	public void display3() {
		System.out.println("Method created in B display 3");
	}
}

class MainOver {

	public static void main(String[] args) {
		MethodOverride methodOverride = new MethodOverride();
		methodOverride.display();
		methodOverride.display1();

		System.out.println("********************************************");

		A c = new A();
		c.display();
		c.display1();
		c.display2();

		System.out.println("********************************************");

		MethodOverride a = new A();
		a.display();
		a.display1();

		System.out.println("********************************************");

		B b = new B();
		b.display();
		b.display1();
		b.display3();
		b.dis5();

	}
}