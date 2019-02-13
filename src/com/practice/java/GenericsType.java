package com.practice.java;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@SuppressWarnings("rawtypes")
public class GenericsType<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static <T> void test() {
		System.out.println(2 + 3);
	}

	public static void main(String[] args) {
		GenericsType<String> genericsType = new GenericsType<>();
		genericsType.setT("subu");
		System.err.println(genericsType.getT());

		GenericsType<Integer> genericsType1 = new GenericsType<>();
		genericsType1.setT(1);
		System.err.println(genericsType1.getT());
		GenericsType.test();
		GenericsType.<Integer>test();

		GenericsType type1 = new GenericsType(); // raw type
		type1.setT("Pankaj"); // valid
		type1.setT(10);

//		java.util.List<Long> list = new ArrayList<Long>();
//		list.add(Long.valueOf(10));
//		java.util.List<Double> list2 = list;
//		list2.add(Double.valueOf(12));
		int j =10;
		Integer kIn = Integer.valueOf(j);
		System.out.println("kIn "+kIn);
		
		Integer lInteger = 23;
		int k = lInteger.intValue();
		System.out.println("k "+k);
		
	

	}

}

//public class GenericsType<T> {
//
//	private T t;
//	
//	public T get(){
//		return this.t;
//	}
//	
//	public void set(T t1){
//		this.t=t1;
//	}
//	
//	public static void main(String args[]){
//		GenericsType<String> type = new GenericsType<>();
//		type.set("Pankaj"); //valid
//		
//		GenericsType type1 = new GenericsType(); //raw type
//		type1.set("Pankaj"); //valid
//		type1.set(10); //valid and autoboxing support
//	}
//}
