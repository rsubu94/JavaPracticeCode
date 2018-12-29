package com.practice.java;

import java.util.Arrays;

public class LambdaExpressions {

	public static void main(String[] args) {
		new Thread ( () ->  {
			System.out.println("My Runnable");
		}).start();
		
		Employee e[] = {
				new Employee("Subu"),
				new Employee("Vicky"),
				new Employee("Javith"),
				new Employee("Tommy")
		};
		
		System.out.println("Before Sorting :: "+Arrays.toString(e));
		Arrays.sort(e, Employee::nameCompare);
		System.out.println("After Sorting :: "+Arrays.toString(e));
		
		int x=10,y=20;
	
	}
}

class Employee{
	
	String eName;
	
	Employee(String ename)
	{	
		this.eName = ename;
	}
	
	public static int nameCompare(Employee a1,Employee a2)
	{
		return a1.eName.compareTo(a2.eName);
	}
	
	public static int add(int a , int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	public String toString()
	{
		return eName;
	}
}