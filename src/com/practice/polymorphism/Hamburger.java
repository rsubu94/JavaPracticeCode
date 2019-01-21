/**
 * 
 */
package com.practice.polymorphism;

/**
 * @author r_subramanian
 *
 */
public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRoll;

	private String addition1;
	private double additionalAmount1;

	private String addition2;
	private double additionalAmount2;
	
	private String addition3;
	private double additionalAmount3;
	
	private String addition4;
	private double additionalAmount4;

	public Hamburger(String name, String meat, double price, String breadRoll) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRoll = breadRoll;
	}
	
	public void addHamburgerAddition1(String name,double price)
	{
		this.addition1 = name;
		this.additionalAmount1 = price;
	}
	
	public void addHamburgerAddition2(String name,double price)
	{
		this.addition2 = name;
		this.additionalAmount2 = price;
	}
	
	public void addHamburgerAddition3(String name,double price)
	{
		this.addition3 = name;
		this.additionalAmount3 = price;
	}
	public void addHamburgerAddition4(String name,double price)
	{
		this.addition4 = name;
		this.additionalAmount4 = price;
	}
	
	public double totalPrice() {
		double totalPrice=this.price;
		System.out.println("Price of the hamburger "+this.name+ " is "+this.price +" for the type "+this.breadRoll);
		if(addition1 !=null)
		{
			totalPrice += this.additionalAmount1;
			System.out.println("Revised price after the additional items is "+totalPrice+"\n"+"Added item is "+this.addition1);
		}
		if(addition2 !=null)
		{
			totalPrice += this.additionalAmount2;
			System.out.println("Revised price after the additional items is "+totalPrice+"\n"+"Added item is "+this.addition2);
		}
		if(addition3 !=null)
		{
			totalPrice += this.additionalAmount3;
			System.out.println("Revised price after the additional items is "+totalPrice+"\n"+"Added item is "+this.addition3);
		}
		if(addition4 !=null)
		{
			totalPrice += this.additionalAmount4;
			System.out.println("Revised price after the additional items is "+totalPrice+"\n"+"Added item is "+this.addition4);
		}
		return totalPrice;
	}

}
