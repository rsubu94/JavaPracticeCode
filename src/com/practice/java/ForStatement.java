package com.practice.java;

import java.util.Formatter;

public class ForStatement {

	public static void main(String[] args) {
		int count=0;
//		for (int i=10;i<150;i++)
//		{
//			if(isPrime(i)) {
//				count++;
//				System.out.println("Prime Number is "+i+" and the count is "+count);
//				if(count==20)
//				{
//					System.out.println("Count Exceeds "+ count +" so existing the loop");
//					break;
//				}
//			}
		
		for (int n =100 ; n<333130;n+=10)
		{
			System.out.println("Number "+n);
			
		}

//StringBuilder sbuf = new StringBuilder();
//Formatter fmt = new Formatter(sbuf);
//fmt.format("PI = %d", Math.sqrt(6));
//System.out.print(sbuf.toString());
//// you can continue to append data to sbuf here.

	}
	
	
	public static boolean isPrime(int n)
	{
		if(n==1)
		{
			return false;
		}
		// for(int i=2;i<=n/2;i++) or
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			System.out.println("I "+i);
			System.out.println("N "+n);
			System.out.println("S "+Math.sqrt(n));
			System.out.println("M "+n%i);
			if(n%i==0) {
				return false;
			}
		}
		return true;
			
	}
}
