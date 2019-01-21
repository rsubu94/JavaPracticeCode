package com.practice.encapsulation;

public class Player {

	public String name;
	public int playerHealth;
	public String weapon;

	public void loseHealth(int damage) {
		this.playerHealth = this.playerHealth - damage;
		if (this.playerHealth <= 0) {
			System.out.println("Player knocked out");
		}
	}

	public int healthRemaining() {
		return this.playerHealth;
	}

}
