package com.practice.java;

public interface Test2 {
	public void show();
	default void show1() {
		System.out.println("show1 of IInd interface method");
	}
	
}