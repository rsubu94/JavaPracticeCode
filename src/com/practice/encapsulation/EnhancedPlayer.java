package com.practice.encapsulation;

public class EnhancedPlayer {
	
	private String name;
	private int playerHealth;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		this.name = name;
		
		if(health >0 && health<=100)
		this.playerHealth = health;
		
		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		this.playerHealth = this.playerHealth - damage;
		if (this.playerHealth <= 0) {
			System.out.println("Player knocked out");
		}
	}

	public int healthRemaining() {
		return this.playerHealth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return playerHealth;
	}

	public void setHealth(int health) {
		this.playerHealth = health;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	


	

}
