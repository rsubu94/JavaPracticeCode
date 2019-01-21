package com.practice.encapsulation;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
//		player.name = "Subramanian R";
//		player.health = 68;
//		player.weapon = "Sword";
//
//		int damage = 20;
//		player.loseHealth(damage);
//		System.out.println(player.healthRemaining());
		
		EnhancedPlayer sp =new EnhancedPlayer("SUbu", -85, "Sword");
		System.out.println(sp.getHealth());
	}

}
