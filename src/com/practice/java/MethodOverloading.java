package com.practice.java;

public class MethodOverloading {

	public static void main(String[] args) {
	int newScore =	calculateScore("Subu", 80);
	System.out.println("Newscore is "+newScore);
	int nextNewScore=calculateScore(90);
	System.out.println("Next new score "+nextNewScore);
	int noScore = calculateScore();
	System.out.println("Noscore "+noScore);
	
	double totalCentimeter=calculateFeetAndInches(1);
	System.out.println("Total Centimeter "+totalCentimeter);
	
	}
	
	public static int calculateScore(String playerName,int score) {
		System.out.println("Player "+playerName +" has scored "+score);
		return score*002;
		
	}
	public static int calculateScore(int score ) {
		return score*002;
		
	}
	
	public static int calculateScore( ) {
		return 0;
	
		
		
	}
	
	public static double calculateFeetAndInches(double feet,double inches)
	{	
		if((feet <0)||((inches<0) ||(inches>12))) {
			return -1;
		}
		
		double centimeters = (feet * 12) *2.54;
		centimeters += inches * 2.54;
		System.out.println(feet +" feet , "+inches+" inches ="+centimeters + " cm");
				
		return centimeters;
	}
	
	public static double calculateFeetAndInches(double inches)
	{	
		if((inches <0)) {
			return -1;
		}
		double feet = (int) inches /12;
		double remainingInches = (int) inches % 12;
		System.out.println("feet "+feet+" remainginches "+remainingInches);
				
		return calculateFeetAndInches(feet, remainingInches);
	}
	
	
}

