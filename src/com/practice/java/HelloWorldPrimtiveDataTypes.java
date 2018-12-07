package com.practice.java;

public class HelloWorldPrimtiveDataTypes {
	
	public static void main(String args[])
	
	{
		System.out.println("Hello World!!");
		
		
		/*Primitive DataTypes - 8 Types of Data Types
		 * char 		-		16 bits(2 bytes)
		 * boolean		-		08 bits	(1 byte)
		 * int			-		32 bits (4 bytes)
		 * short		-		16 bits (2 bytes)
		 * double		-		64 bits (8 bytes)			
		 * float		-		32 bits (4 bytes)
		 * long			-		64 bits (8 bytes)
		 * byte			-		08 bits	(1 byte)
		 * */
		
		
		//byte has a width of 8 bit
		byte mybytevalue= -127;//min byte value
		byte newbytevalue =(byte) (mybytevalue/2);
				
		//Int has a width of 32 bit
		int myMinValue=-2_14_74_83_648; //Min int value holds,from java & underscores are used to separate the no
		int myMaxValue= 2_147_483_647; //Max no allowed for int
						
		//short has a width of 16
		short myShortValue = 32767;
		short newshortvalue = (short) (myShortValue/2);
				
		
		//long has a width of 64
		long mylongvalue =50000l +10L * (mybytevalue + myShortValue + myMaxValue ); // max no of value allowed is 2 power 63
		short shortvalue = (short)(1000 + 10 * (mybytevalue + myShortValue + myMaxValue ));
		
	
		
		//float has a width of 32 (4bytes)
		float myfloatvalue= 5f /3;
		
		//double has a width of 64 (8 bytes)
		double mydoublevalue = 5d/3;
		
		//char has a width 16 (2 bytes)
		char mychar = '\u00A9'; //unicode character of 
		System.out.println(mychar);
		
		//boolean
		boolean myboolean = false;
		
		
		System.out.println(newbytevalue);
		System.out.println(newshortvalue);
		System.out.println(mylongvalue);
		System.out.println(shortvalue);
		System.out.println(myfloatvalue);
		System.out.println(mydoublevalue);
		
		
	}

}
