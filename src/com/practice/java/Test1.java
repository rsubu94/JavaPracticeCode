package com.practice.java;

public interface Test1 {
	
	public void show();
	default void show1() {
		System.out.println("Show1 default method");
	}
	

}

