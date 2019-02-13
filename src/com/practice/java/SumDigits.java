package com.practice.java;

public class SumDigits {

	public static void main(String[] args) {
		int n=1458;
		int plus=0;
		int i=0;
		while(n!=0)
		{
			plus +=n%10;
			System.out.println(plus);
			n /= 10;
			System.out.println("::n:: "+n);
			//i++;
		}
		System.out.println("plus "+plus);
	}

}
