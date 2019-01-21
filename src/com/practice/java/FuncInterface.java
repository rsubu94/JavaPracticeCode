package com.practice.java;

@FunctionalInterface
public interface FuncInterface {
	void abstrctFunc(int x);
	
	default void normalFunc() {
		System.out.println("Normal Function");
	}

}
