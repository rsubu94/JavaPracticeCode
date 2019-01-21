package com.practice.polymorphism;

import jdk.internal.dynalink.beans.StaticClass;

public class HealthyBurger extends Hamburger {
	
	private String healthyExtraName1;
	private double healthyExtraPrice1;
	
	private String healthyExtraName2;
	private double healthyExtraPrice2;



	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
	}
	
	public void addHealthyAddition1(String name,double price)
	{
		this.healthyExtraName1 = name;
		this.healthyExtraPrice1 = price;
	}
	
	public void addHealthyAddition2(String name,double price)
	{
		this.healthyExtraName2 = name;
		this.healthyExtraPrice2 = price;
	}

	@Override
	public double totalPrice() {
		double totalPrice = super.totalPrice();
		//System.out.println("Price of the hamburger "+this.name+ " is "+this.price +" for the type "+this.breadRoll);
		if(healthyExtraName1 !=null)
		{
			totalPrice += this.healthyExtraPrice1;
			System.out.println("Revised price after the additional items is "+totalPrice+"\n"+"Added item is "+this.healthyExtraName1);
		}
		if(healthyExtraName2 !=null)
		{
			totalPrice += this.healthyExtraPrice1;
			System.out.println("Revised price after the additional items is "+totalPrice+"\n"+"Added item is "+this.healthyExtraName2);
		}
		return totalPrice;
		 
	}
	
	

}
