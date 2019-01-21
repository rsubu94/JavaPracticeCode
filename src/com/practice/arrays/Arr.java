package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] s) {
		int [] integer = getIntegers(5);
		for(int i=0;i<integer.length;i++)
		{
		
			System.out.println(integer[i]);
		}
		System.out.println(add(integer));
	}

	public static int[] getIntegers(int no)
	{
		System.out.println("Number is "+no +" ......."+'\n');
		int values[] = new int[no];
		for(int i=0;i<values.length;i++)
		{
			values[i]=scan.nextInt();
		}
	
		return values;
	}
	
	public static double add(int[] arr)
	{
		double total = 0;
		for(int i=0;i<arr.length;i++){
			total +=arr[i];
		}
		total = total/arr.length;
		return total;
	}
}
