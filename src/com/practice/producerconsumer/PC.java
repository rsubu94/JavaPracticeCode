package com.practice.producerconsumer;

import java.util.Currency;
import java.util.LinkedList;
import java.util.Locale;

public class PC extends Thread {
	LinkedList<Integer> linkedList = new LinkedList<>();
	int capacity = 4;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				if (linkedList.size() == capacity)
					wait();

				System.out.println("Produced Value " + value);
				linkedList.add(value++);
				notify();

				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (linkedList.size() == 0)
					wait();
				System.out.println("Consumed Value " + linkedList.removeFirst());
				notify();
				Thread.sleep(1000);
			}
		}
	}
}
