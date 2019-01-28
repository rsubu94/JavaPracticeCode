package com.practice.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Count : \r");
		int count = scan.nextInt();
		int[] returnArr = readInteger(count);
		System.out.println("Given Array : " + Arrays.toString(returnArr));
		reverse(returnArr);
		reverseInbulit(returnArr);
	}

	private static int[] readInteger(int count) {
		int values[] = new int[count];
		for (int i = 0; i < values.length; i++) {

			values[i] = scan.nextInt();

		}
		return values;
	}

	private static void reverse(int[] arr) {

		int maxindexx = arr.length - 1;
		int halfLength = arr.length / 2;

		for (int i = 0; i < halfLength; i++) {
			int temp = arr[i];
			arr[i] = arr[maxindexx - i];
			arr[maxindexx - i] = temp;
		}
		System.out.println("Reversed Array : " + Arrays.toString(arr));
	}

	// reverse array using in-built method

	private static void reverseInbulit(int[] array) {
		Collections.reverse(Arrays.asList(array));
		System.out.println("Reversed array inbuilt5 " + Arrays.toString(array));
	}

}
