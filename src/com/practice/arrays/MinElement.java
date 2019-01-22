package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

import javafx.beans.property.ReadOnlyIntegerProperty;

public class MinElement {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Count : \r");
		int count = scan.nextInt();
		int[] returnArr = readInteger(count);
		findMin(returnArr);
	}

	private static int[] readInteger(int count) {
		int values[] = new int[count];
		for (int i = 0; i < values.length; i++) {

			values[i] = scan.nextInt();

		}
		return values;
	}

	private static void findMin(int[] arr) {
		System.out.println("Given array : " + Arrays.toString(arr));
		int min = arr[0];//Integer.MAX_VALUE;
		for (int i =0; i < arr.length; i++) {
			if (arr[i]> min) {
				min = arr[i];
			}
		}

		System.out.println("Minimum Element in the array is : " + min);

	}
}
