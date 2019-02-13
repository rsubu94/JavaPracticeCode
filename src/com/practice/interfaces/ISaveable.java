package com.practice.interfaces;

import java.util.List;

interface ISaveable {
	public static final int value = 10;
	public int val=9;

	List<String> write();

	void read(List<String> readList);

	public static void nooone() {
		System.out.println("11");
	}

	static void test() {
		System.out.println("Inside interface");
	}
	
	default void testt() {
		System.out.println("default test method");
	}

}

interface ISave{
	default void testt() {
		System.out.println("default test method");
	}
}
