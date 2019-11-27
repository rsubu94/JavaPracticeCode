package com.practice.java;

class ThreadQuet implements Runnable {
	public void run() {
		System.out.println("Current Thread " + Thread.currentThread().getName()
				);
	}
}

class Two implements Runnable {
	public void run() {
		new ThreadQuet().run();
		System.out.println("After threadquet");
		new Thread(new ThreadQuet(), "gfg").run();
		System.out.println("After threadquet 2");
		new Thread(new ThreadQuet(), "gfg3").start();
		System.out.println("After threadquet 3");
	}
}

class Three {
	public static void main(String[] args) {
		new Thread(new Two(),"gfg4").start();
	}
}