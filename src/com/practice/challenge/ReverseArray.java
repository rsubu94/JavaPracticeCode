package com.practice.challenge;

import jdk.internal.dynalink.beans.StaticClass;

public class ReverseArray {

	static int num=0;
	static String myString="";
	
	public ReverseArray() {
		num=10;
		myString="Constructor";
	}
	
	static {
		System.out.println("s b 1");
		num = 56;
		myString = "block1";
	}
	static {
		System.out.println("s b 2");
		num = 67;
		myString = "block2";
	}
	
	
	private int data=5;
	
	public int getData() {
		return this.data;
	}
	
	public int getData(int value) {
		return (data+1);
	}
	
	public int getData(int... val) {
		for(int g:val) {
			data +=g;
		}
		return data;
	}
	
	public static void main(String[] args) {
	ReverseArray reverseArray  = new ReverseArray();
	System.out.println(reverseArray.num);
	System.out.println(reverseArray.myString);
	System.out.println(ReverseArray.num);
	System.out.println(ReverseArray.myString);
	
	System.out.println(reverseArray.getData(7,8,12));
		
//		int [] a = {1,2,3,4,5,6,7};
//		for(int i=0;i<a.length/2;i++) {
//			System.out.println("i   "+i);
//			System.out.println("a.length-i-1   "+(a.length-i-1));
//			int temp = a[i];
//			a[i]=a[a.length-i-1];
//			a[a.length-i-1]=temp;
//		}
//	
//		for(int g : a) {
//			System.out.println(g);
//		}
		
//		StringBuilder stringBuilder = new StringBuilder("Java");
//		String s1= "Love";
//		stringBuilder.append(s1);
//		System.out.println("stringBuilder "+stringBuilder);
//		System.out.println("substring "+stringBuilder.substring(4));
//		stringBuilder.substring(4);
//		int foun = stringBuilder.indexOf(s1);
//		System.out.println(foun);
//		
		String s2="Hello";
		String s4 ="test";
		String s3= new String(s2);
		String s5="Hello".concat("World");
		System.out.println(s5);
		System.out.println(s2.equals(s3));
		
		
	}
	
	public static void main(String a) {
		
	}
}
