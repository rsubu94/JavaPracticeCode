package com.practice.java;

class Singleton {

	
	public static int count;

	public Singleton() {
		//System.out.println("Count Constructor " + count);
	}
	{
		count++;
	}

	public void getSingleton() {
//		singleton = new Singleton();
		
//		singleton.getSingleton();
		//Singleton singleton1 = new Singleton();

		Singleton singleton2 = new Singleton();

		Singleton singleton3 = new Singleton();

		Singleton singleton4 = new Singleton();

		System.out.println("Count  " + count);
		if (count > 4) {
			throw new CustException("More than 4 objects requested");
		}

	}
}

class MainSingleton {
	public static void main(String[] args) {
//		try {
		Singleton singleton = new Singleton();
			singleton.getSingleton();

//		} catch (CustException e) {
//			System.out.println(e.getErrorMessageString());
//		}

	}
}
