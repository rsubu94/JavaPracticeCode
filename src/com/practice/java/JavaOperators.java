package com.practice.java;

import java.util.Arrays;

class InstanceOF{
	 
	
}

public class JavaOperators {
	
	public static void main(String []args) {
		/* Java Operators
		 * 
		 *Plus,minus,multiply,division,reminder ---> ( + , - , * , / , %)
		 *OR , AND & ternary  operators
		 * 
		 * */
		int i=56;
		InstanceOF in = new InstanceOF();
		System.out.println("Is True : "+(in instanceof InstanceOF));
		
		System.out.println("String Value : "+Integer.toBinaryString(i));
		
		int invertedNumber = ~i;
		System.out.println("Inverted Number "+ invertedNumber);
		System.out.println("Binary Value "+Integer.toBinaryString(invertedNumber));
		
		int inputArray[] = {1,2,5,9,8,10,2,7,10,7,7,7};
	      int i1, del=7, count=0;
	      for(i1=0; i1<inputArray.length; i1++)
	       {
	           if(inputArray[i1] == del)
	           {
	               for(int j=i1; j<(inputArray.length-1); j++)
	               {
	                   inputArray[j] = inputArray[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	      
	      for (int j=0;j<(inputArray.length-1);j++)
	       System.out.println(inputArray[j]);
	    
	  
		
		
	}

}
