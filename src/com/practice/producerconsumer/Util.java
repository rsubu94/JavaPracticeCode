package com.practice.producerconsumer;

class Utility {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Shared {
	void test1(Shared s2) {
		synchronized (this) {
			System.out.println("test 1 begin");
			Utility.sleep(1000);
			s2.test2(this);
			System.out.println("test 1 ends");
		}

	}

	void test2(Shared s1) {
		synchronized (this) {
			System.out.println("test 2 begin");
			Utility.sleep(1000);
			s1.test1(this);
			System.out.println("test 2 ends");
		}

	}
}

class Thread1 extends Thread {
	private Shared s1;
	private Shared s2;

	public Thread1(Shared s1, Shared s2) {
		// super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s1.test1(s2);
	}
}

class Thread2 extends Thread {
	private Shared s1;
	private Shared s2;

	public Thread2(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s2.test1(s1);
	}
}

public class Util {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		//Thread1 thread3 = new Thread1(s1, s2);
		//thread3.start();

		Thread2 thread2 = new Thread2(s1, s2);
		thread2.start();
		Utility.sleep(1000);
	}
}
