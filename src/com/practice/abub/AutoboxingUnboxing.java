package com.practice.abub;

import java.util.ArrayList;

public class AutoboxingUnboxing {
	
	public static void main(String[] args) {
		//Autoboxing - convert primitive type to object type
		// int - primitive type
		//Integer - Object type or Wrappper Class
		
		Integer integer = new Integer(45);
		Double doubl = new Double(12.5);
		
		ArrayList<Integer> intArrList = new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			intArrList.add(Integer.valueOf(i)); //Autoboxing PT to OT
		}
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(intArrList.get(i).intValue());  //unboxing OT to PT
		
		}
		
		//Correct Way of doing
		
		Integer myInteger = 78; //while compile time it will  be converted to the format Integer.valuesOf(i)
		int b = myInteger;
		
		
		
		int c = 45; //while compile time it will  be converted to the format myIntValue.intValue()
		Integer i = c;
		
		System.out.println(myInteger);
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		
		ArrayList<Double> doubleValue = new ArrayList<>();
		for(double dbl=0.0;dbl<=10.0;dbl +=0.5)
		{
			doubleValue.add(dbl); //Autoboxing PT to OT
		}
		
		for(int i1=0;i1<=10;i1++)
		{
			System.out.println(doubleValue.get(i1));  //unboxing OT to PT
		
		}
	}

}
