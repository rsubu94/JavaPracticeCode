package com.practice.java;

public class KeywordsAndExpressions {
	
	//There are 53 keywords in java

	public static void main(String [] args) {
		
		int myvariable=50;//Java Statement ... any after data type until semicolon is considered as Java Expressions
		myvariable++;
		System.out.println(myvariable);
		myvariable--;
		System.out.println(myvariable);
		++myvariable;
		System.out.println(myvariable);
		--myvariable;
		System.out.println(myvariable);
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}

	}

}
