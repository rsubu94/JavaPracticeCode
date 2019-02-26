package com.practice.java;

import java.util.Scanner;

public class LabeledBreakStatement {
	public static void main(String[] args) {
//		int [][] arr = {{1,2},{3,4},{5,6},{7,8}};
//		boolean found = false;
//		int row =0;
//		int col=0;
//		
//		searchint:
//				for ( row = 0; row < arr.length; row++) {
//					
//					for ( col = 0; col < arr[row].length; col++) {
//						System.out.println("row "+row);
//						System.out.println("col "+col);
//						System.out.println("Value "+arr[row][col]);
//						if (arr[row][col] > 5) {
//							System.out.println("inside value check");
//							found = true;
//							System.out.println("iFoiunf "+found);
//							// using break label to terminate outer statements
//							break searchint;
//						}
//					}
//				}
//		System.out.println(found);
//		if(found)
//			System.out.println(row +"," +col);
		
		 Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);
	      
	      while (true) {
	         System.out.print("Enter a number: ");
	         number = input.nextDouble();
	         
	         if (number < 0.0) {
	            break;
	         }
	         
	         sum += number;
	      }
	      System.out.println("Sum = " + sum);	
	}

}
