package com.practice.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class InterfaceChallengeMain {

	public static void main(String[] args) {
		Player player = new Player("Bill", 12, 20);
		saveObject(player);
		player.setHitPoints(15);
		player.setWeapon("StormBringer");
		saveObject(player);
		System.out.println("before ");
		// loadObject(player);
		// System.out.println(player);

		ISaveable monster = new Monsters("Direwolf", 30, 23);
		System.out.println(((Monsters) monster).getStrength());
		saveObject(monster);
		System.out.println(monster);
		ISaveable.nooone();
		ISaveable.test();
System.out.println(ISaveable.value);
		monster.testt();

	}

	public static List<String> readValues() {
		List<String> values = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose \n" + "1 to enter the string \n" + "0 to quit");

		while (!quit) {
			System.out.println("Choose an option");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				System.out.println("Existing.,....");
				quit = true;
				break;

			case 1:
				System.out.println("Enter the string ");
				String stringInput = scanner.nextLine();
				System.out.println("SInput " + stringInput);
				values.add(index, stringInput);
				index++;
				break;

			}
		}
		// scanner.close();
		return values;
	}

	public static void saveObject(ISaveable objectToSave) {
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}

	public static void loadObject(ISaveable objectToLoad) {
		List<String> values = readValues();
		objectToLoad.read(values);

	}

}
