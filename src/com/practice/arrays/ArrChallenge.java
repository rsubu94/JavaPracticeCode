package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrChallenge {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int [] arr = getIntegers(6);
		//printArr(arr);
		sortArr(arr);
		
	}
	
	public static int[] getIntegers(int no)
	{
		int values[] = new int[no];
		System.out.println("Enter the number \n");
		for (int i=0;i<values.length;i++) {
			values[i]=scan.nextInt();
		}
		return values;
	}
	
	public static void printArr(int[] arr) {
		System.out.println("Inserted Value : "+ Arrays.toString(arr));
		
	}
	
	public static void sortArr(int [] arr)
	{
//		int newArr[]= new int[arr.length];
//		for (int i=0;i<arr.length;i++) {
//			newArr[i]= arr[i];
//		}
		
		//alternative way of copying
		
		
		int newArr[] = arr; //Arrays.copyOf(arr, arr.length);
		


		boolean flag=true;
		int temp;
		while(flag) {
			System.out.println("FLAG : "+flag);
			flag=false;
			for(int j=0;j<newArr.length-1;j++)
			{
				System.out.println("Jj : "+j);
				System.out.println("Jj+ 1 : "+(j+1));
				System.out.println("NewArr j : "+newArr[j]);
				System.out.println("NewArr j+1 : "+newArr[j+1]);
				System.out.println("loogp : "+(newArr[j] < newArr[j+1]));
				if(newArr[j] >newArr[j+1]) {
					temp = newArr[j];
					System.out.println("Temp 1 : "+temp);
					newArr[j] = newArr[j+1];
					newArr[j+1] = temp;
					System.out.println("Temp 2 : "+newArr[j+1]);
					flag=true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		printArr(newArr);
	}
}
