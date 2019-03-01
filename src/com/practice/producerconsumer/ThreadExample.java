package com.practice.producerconsumer;

public class ThreadExample extends Thread {
	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		thread.start();
		thread2.start();

		thread.join(100);
		thread2.join(100);
	}

}
