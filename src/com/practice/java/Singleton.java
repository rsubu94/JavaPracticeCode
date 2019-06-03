package com.practice.java;

class Singleton {

	public static int count = 1;
	public static Singleton singleton;

	private Singleton() {
		count++;
	}

	public static Singleton getSingleton() {
		System.out.println("Count  " + count);
		if (count > 4) {
			throw new CustException("More than 4 objects requested");
		}
		singleton = new Singleton();
		System.out.println("Created Object "+singleton);
		return singleton;

	}
}

class MainSingleton {
	public static void main(String[] args) {
		try {
			Singleton singleton1 = Singleton.getSingleton();
			Singleton singleton2 = Singleton.getSingleton();
			Singleton singleton3 = Singleton.getSingleton();
			Singleton singleton4 = Singleton.getSingleton();
			Singleton singleton5 = Singleton.getSingleton();
			Singleton singleton6 = Singleton.getSingleton();
			Singleton singleton7 = Singleton.getSingleton();
		} catch (CustException e) {
			System.err.println("Exception : "+e.getErrorMessageString());
		}

		

	}
}
