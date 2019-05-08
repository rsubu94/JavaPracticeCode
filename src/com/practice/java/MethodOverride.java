package com.practice.java;

<<<<<<< HEAD
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
=======
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

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

class B extends A{
	public void display4() {

		System.out.println("Method created in B display ");
		 super.display();
	}

	public void display3() {
		System.out.println("Method created in B display 3");
>>>>>>> c1713c31b157a61f2e7c0d08a044ab8c44854106
	}
}

class MainOver {
<<<<<<< HEAD
		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			MethodOverride mOverride = new MethodOverride();
			mOverride.display();
			mOverride.display1();
			
			B b = (MethodOverride)Class.forName("MethodOverride").newInstance();
			b.
		}
=======
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
>>>>>>> c1713c31b157a61f2e7c0d08a044ab8c44854106
}