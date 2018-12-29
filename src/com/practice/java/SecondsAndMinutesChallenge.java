package com.practice.java;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hours=secAndMin(65,9);
		System.out.println("Hours "+hours);
		String next = secAndMin(58955);
		System.out.println("Complete Hours "+next);

	}
	
	public static String secAndMin(int minutes,int seconds) {
		if((minutes <0) || (seconds<0) || (seconds>59))
		{
			return "Invalid Value";
		}
		
		int hours = minutes /60;
		
		System.out.println("Hours "+hours);
		int remaining= minutes % 60;
		System.out.println("Remaining Minutes "+remaining);
		String totalHours=hours+"h "+remaining+ "m "+seconds+"seconds";
		return totalHours;
	}
	
	public static String secAndMin(int seconds) {
		if((seconds <0))
		{
			return "Invalid Value";
		}
		
		int minutes = seconds /60;
		System.out.println("Minutes "+minutes);

		int reseconds= seconds % 60;
		System.out.println("Seconds "+reseconds);

		
		//String totalHours=hours+"h "+remaining+ "m "+seconds+"seconds";
		return secAndMin(minutes,reseconds);
	}
	
	
	

}
