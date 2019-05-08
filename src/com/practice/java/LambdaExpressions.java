//package com.practice.java;
//
//import java.util.Arrays;
//
//public class LambdaExpressions {
//
//	public static void main(String[] args) {
//		new Thread ( () ->  {
//			System.out.println("My Runnable");
//		}).start();
//
//		//Employeee e[] = { new Employee("Subu"), new Employee("Vicky"), new Employee("Javith"), new Employeee("Tommy") };
//
//		System.out.println("Before Sorting :: " + Arrays.toString(e));
//		Arrays.sort(e, Employee::nameCompare);
//		System.out.println("After Sorting :: " + Arrays.toString(e));
//	
//
//	
//
//	}
//}
//
//class Employee {
//
//	String eName;
//
//	Employee(String ename) {
//		this.eName = ename;
//	}
//
//	public static int nameCompare(Employeee a1, Employeee a2) {
//		return a1.eName.compareTo(a2.eName);
//	}
//
//	public static String name(String name) {
//		return "Value Returned"+name;
//	}
//
//	public String toString() {
//		return eName;
//	}
//}