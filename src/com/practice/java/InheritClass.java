package com.practice.java;

public class InheritClass implements Test1,Test2{

	@Override
	public void show() {
		System.out.println("Implemeted show method in the class");
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		Test1.super.show1();
		Test2.super.show1();
	}
	public void inhericlass() {
		System.out.println("Testing inheritclss method");
	}

}
