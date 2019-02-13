package com.practice.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable,ISave {
	private String name;
	private int hitPoints;
	private int strength;

	public Monsters(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	@Override
	public List<String> write() {
		List<String> vaList =  new ArrayList<>();
		vaList.add(0,this.name);
		vaList.add(1,""+this.hitPoints);
		vaList.add(2,""+this.strength);
		
		return vaList;
	}

	@Override
	public void read(List<String> readList) {
		if(readList !=null && readList.size()>0)
		{
			this.name = readList.get(0);
			this.hitPoints = Integer.parseInt(readList.get(1));
			this.strength = Integer.parseInt(readList.get(2));
		}
	}

	@Override
	public String toString() {
		return " [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "]";
	}

	@Override
	public void testt() {
		
		ISave.super.testt();
	}
	
	
	
	

}
