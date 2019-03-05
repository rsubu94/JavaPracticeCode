package com.practice.boundedparam;


class BoundedParameters<T extends A> {
	private T obj;

	public BoundedParameters(T obj) {
		super();
		this.obj = obj;
	}

	public void doRunTest() {
		this.obj.displayClass();
	}

}


class A{
	
	public void displayClass() {
		System.out.println("Inside class A");
	}
}

class B extends A{
	public void displayClass() {
		System.out.println("Inside class B");
	}
}

class C extends A{
	public void displayClass() {
		System.out.println("Inside class C");
	}
}

class Main{
	public static void main(String[] args) {
		BoundedParameters<C> boundedParametersC = new BoundedParameters<C>(new C());
		boundedParametersC.doRunTest();
		
		BoundedParameters<B> boundedParametersB = new BoundedParameters<B>(new B());
		boundedParametersB.doRunTest();
		
		BoundedParameters<A> boundedParametersA = new BoundedParameters<A>(new A());
		boundedParametersA.doRunTest();
		
	}
}
