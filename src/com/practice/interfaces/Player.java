package com.practice.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

	private String pName;
	private int hitPoints;
	private int strength;
	private String weapon;

	public Player(String pName, int hitPoints, int strength) {
		super();
		this.pName = pName;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public List<String> write() {
		//System.out.println("Inside Write");
		List<String> listValues = new ArrayList<>();
		listValues.add(0, this.pName);
		listValues.add(1, "" + this.hitPoints);
		listValues.add(2, "" + this.strength);
		listValues.add(3, this.weapon);
		return listValues;
	}

	@Override
	public void read(List<String> readList) {
		System.out.println("Inside read");
		if (readList != null && readList.size() > 0) {
			this.pName = readList.get(0);
			this.hitPoints = Integer.parseInt(readList.get(1));
			this.strength = Integer.parseInt(readList.get(2));
			this.weapon = readList.get(3);
		}

	}

	@Override
	public String toString() {
		return "pName=" + pName + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon=" + weapon + "";
	}

}
