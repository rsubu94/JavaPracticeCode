package com.practice.boundedparam;

class D implements E{
	public void displayClass() {
		
	}
}

interface E{
	public void displayClass();
}


class Mainq<T extends D & E> {
	private T obj;

	public Mainq(T obj) {
		super();
		this.obj = obj;
	}
	
	public void doRunTest() {
		this.obj.displayClass();
	}
}

class BPWithInterfaces{
	public static void main(String[] args) {
		Mainq<D> bpWithInterfaces = new Mainq<D>(new D());
		bpWithInterfaces.doRunTest();
	}
}