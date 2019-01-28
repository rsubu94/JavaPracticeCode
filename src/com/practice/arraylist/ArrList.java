package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {

	private ArrayList<String> arrList = new ArrayList();
	private static Scanner scanner = new Scanner(System.in);
	private static ArrList groceryList = new ArrList();

	public void addGrocery(String item) {
		arrList.add(item);
	}

	public void printGrocery() {
		System.out.println("Grocery Size " + arrList.size());
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Items " + arrList.get(i));
		}
	}

	public void modifyGrocery(String currentitem, String item) {
		int position = findItem(currentitem);
		if (position >= 0)
			modifyGocery(position, item);
	}

	public void removeItem(String item) {
		int position = findItem(item);
		if (position >= 0)
			removeItem(position);
	}

	private void modifyGocery(int position, String newItem) {
		arrList.set(position, newItem);
		System.out.println("Items modified");
	}

	private void removeItem(int position) {
		arrList.remove(arrList.get(position));
		System.out.println("Items deleted");
	}

	private int findItem(String searchItem) {
		return arrList.indexOf(searchItem);

	}
	
	//Way copying one arraylist to another arraylist
	public void processArraylist() {
		//1st Way
		
		ArrayList<String> newArrList = new ArrayList<>();
		newArrList.addAll(arrList);
		
		for (int i = 0; i < newArrList.size(); i++) {
			System.out.println("\n New Array List " + newArrList.get(i));
		}
		
		//2nd Way
		ArrayList<String > nextArrList = new ArrayList<>(arrList);
		
		for (int i = 0; i < nextArrList.size(); i++) {
			System.out.println("\n Next Array List " + nextArrList.get(i));
		}
		
		//To convert arraylist to regular array type
		String [] stringArray = new String[arrList.size()];
		stringArray = arrList.toArray(stringArray);
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("\n Normal Array List " + stringArray[i]);
		}
		
	}

	public static void printInstruction() {
		System.out.println("Press  :");
		System.out.println("\t 0 - To print the choices");
		System.out.println("\t 1 - To Print the grocery");
		System.out.println("\t 2 - To add the grocery");
		System.out.println("\t 3 - To Modify the item");
		System.out.println("\t 4 - To remove the item");
		System.out.println("\t 5 - To Find the item");
		System.out.println("\t 10 - To Find the item");
		System.out.println("\t 6 - To Exist");
	}

	private static void addItem() {
		System.out.println("Enter the item to the List :");
		groceryList.addGrocery(scanner.nextLine());
	}

	public static void main(String[] args) {
		boolean exit = false;
		int choice;
		while (!exit) {
			printInstruction();
			System.out.println("Enter the choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				System.out.println("Grocery List");
				break;
			case 1:
				groceryList.printGrocery();
				break;
			case 2:
				addItem();
				break;
			case 3:
				groceryList.modifyGrocery("subu", "spartacus");
				break;
			case 4:
				groceryList.removeItem("subu");
				break;
			case 5:
				groceryList.findItem("er");
				break;
				
			case 10:
				groceryList.processArraylist();
				break;
			case 6:
				exit = true;
				System.out.println("Code Existed");
				break;
			}
		}

	}

}
