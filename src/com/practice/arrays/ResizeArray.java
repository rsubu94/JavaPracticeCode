package com.practice.arrays;

import java.util.Arrays;

public class ResizeArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 6, 7 };
		System.out.println(Arrays.toString(arr));
		int[] newArr = arr;
		arr = new int[] { 4, 5, 6, 7, 3, 2, 5, 2, 4, 3, 2 };

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
	//	arr[11]=10;
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));

	}

}
