package com.practice.java;

public class PassByValue implements Runnable {

	// swap() doesn't swap i and j
	public static void swap(Integer i, Integer j) {
		Integer temp = new Integer(i);
		i = j;
		j = temp;
		System.out.println("i " + i);
		System.out.println("J " + j);
	}

	public void run() {
		try {
			int a = 5 + 10;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		swap(i, j);
		System.out.println("i = " + i + ", j = " + j);
		System.out.println("Current Thread " + Thread.currentThread().getName());
		PassByValue pByValue = new PassByValue();
		Thread runnable = new Thread(pByValue, "Thread PBY");
		runnable.start();
		System.out.println("Current Thread II " + Thread.currentThread().getName());
		// runnable.setName("Thread pby");
		System.out.println("Next Thread " + runnable.getName());
		try {

			runnable.join();
			System.out.println("join");
			Thread.currentThread().join();
			System.out.println("join2 ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
