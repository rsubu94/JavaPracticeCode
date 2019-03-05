package com.practice.singleton;

class SingletonPattern {
	private static SingletonPattern singletonPattern = null;

	private SingletonPattern() {
	};

	// Normal way creating the singleton object

//	public static SingletonPattern getInstance() {
//		//return new SingletonPattern();
//		if(singletonPattern==null)
//			singletonPattern=new SingletonPattern();
//			return singletonPattern;
//	}

	// Another way of creating singleton object with the help inner static helper
	// class.Mostly used way of creating the object as we don't require
	// synchronization

	private static class SingleHelper {
		private static final SingletonPattern SINGLETON_PATTERN = new SingletonPattern();
	}

	public static SingletonPattern getInstance() {
		return SingleHelper.SINGLETON_PATTERN;
	}

	public void display() {
		System.out.println("Inside of Singleton Pattern ");
	}

}

class Main {
	public static void main(String[] args) {
		SingletonPattern singletonPattern = SingletonPattern.getInstance();
		singletonPattern.display();
		SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
		singletonPattern2.display();
		System.out.println("Singleton 1 : " + singletonPattern.hashCode());
		System.out.println("Singleton 2 : " + singletonPattern2.hashCode());
	}
}
