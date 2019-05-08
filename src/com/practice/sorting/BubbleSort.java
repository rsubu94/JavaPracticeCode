package com.practice.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 ,22};

		int n = arr.length;
		int i, j;
		System.out.println("length " + n);
		for (i = 0; i < n - 1; i++) {
			System.out.println("i " + i);
			for (j = 0; j < n - i - 1; j++) {
				System.out.println("j " + j);
				System.out.println("arr[j] " + arr[j]);
				System.out.println("arr[j + 1] " + arr[j + 1]);

				if (arr[j] > arr[j + 1]) {
					// System.out.println("if");
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.println("after swap arr[j] " + arr[j]);
				System.out.println("after swap arr[j + 1] " + arr[j + 1]);
				System.out.println("Change Array " + Arrays.toString(arr));
			}
		}
		for (int k : arr)
			System.out.println("Array " + k);
	}

}
