package com.practice.java;

class MethodOverride {
	public void display() {
		System.out.println("Method display in Class Override");
	}
	public void display1() {
		System.out.println("Method display 1 in class Override");
	}
}

class B extends MethodOverride{
	public void display() {
		System.out.println("Method display in class B");
	}
	public void display2() {
		System.out.println("Method display 2 in class override");
	}
}

class MainOver {
		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			MethodOverride mOverride = new MethodOverride();
			mOverride.display();
			mOverride.display1();
			
			B b = (MethodOverride)Class.forName("MethodOverride").newInstance();
			b.
		}
}