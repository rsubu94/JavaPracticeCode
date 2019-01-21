package com.practice.challenges;

public class Suzuki extends Car{
	
	private int roadService;

	public Suzuki() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suzuki(String name, String size, int wheels, int doors, int gears, boolean isManual,int roadService) {
		super("Brezza", "4WD", 5,5, 5, true);
		this.roadService = roadService;
	}
	
	public void accelerate(int rate)
	{
		int newVelocity = getCurrentVelocity() + rate;
		if(newVelocity == 0)
			stop("Brezza");
		else if(newVelocity >0 && newVelocity<=10)
			changeGear(1);
		else if(newVelocity >10 && newVelocity<=20)
			changeGear(2);
		else if(newVelocity >30 && newVelocity<=40)
			changeGear(3);
		else if(newVelocity >40 && newVelocity<=50)
			changeGear(4);
		else
			changeGear(5);
		
		if(newVelocity > 0)
		{
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	
	

}
