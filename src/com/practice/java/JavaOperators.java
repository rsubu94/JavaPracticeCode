package com.practice.java;

 class InstanceOF{
	 
	
}

public class JavaOperators {
	
	public static void main(String []args) {
		/* Java Operators
		 * 
		 *Plus,minus,multiply,division,reminder ---> ( + , - , * , / , %)
		 *OR , AND & ternary  operators
		 * 
		 * */
		int i=56;
		InstanceOF in = new InstanceOF();
		System.out.println("Is True : "+(in instanceof InstanceOF));
		
		System.out.println("String Value : "+Integer.toBinaryString(i));
		
		int invertedNumber = ~i;
		System.out.println("Inverted Number "+ invertedNumber);
		System.out.println("Binary Value "+Integer.toBinaryString(invertedNumber));
		
	}

}
