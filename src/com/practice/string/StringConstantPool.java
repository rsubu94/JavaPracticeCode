package com.practice.string;

public class StringConstantPool {
	
	static {
		System.out.println("Static");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		String string = "Subu";
		String string2 ="Subu";
		String string3 = "subu";
		
		String string4 = new String("Rest");
		System.out.println("444 : "+string4.hashCode());
		String string6 = new String(string3);
		System.out.println("44422 : "+string6.hashCode());
		string4="tESTR";
		System.out.println("44411 : "+string4.hashCode());

		String string5 = new String(string4);
		System.out.println("555 : "+string5.hashCode());
		string5 = "string5";

		System.out.println("1 : "+string.hashCode());
		System.out.println("2 : "+string2.hashCode());
		System.out.println("3 : "+string3.hashCode());
		System.out.println("4 : "+string4.hashCode());
		System.out.println("5 : "+string5.hashCode());
	}

}
