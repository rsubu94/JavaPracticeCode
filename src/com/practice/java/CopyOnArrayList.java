package com.practice.java;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayList extends Thread {
	static CopyOnWriteArrayList<String> co = new CopyOnWriteArrayList<>();

	public void run() {
		co.add("d");
	}

	public static void main(String[] args) throws InterruptedException {
		co.add("a");
		co.add("b");
		co.add("c");
		co.remove("c");

		CopyOnArrayList ca = new CopyOnArrayList();
		ca.run();
		Thread.sleep(1000);

		Iterator i = co.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			System.out.println("sss  " + s);
			Thread.sleep(1000);
		}
		System.out.println(co);
	}

}
