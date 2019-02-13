package com.practice.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import com.practice.composition.Case;

public class LinkedListt {
	public static void main(String[] args) {
		LinkedList<String> placeToVisit = new LinkedList<>();
//		placeToVisit.add("USA");
//		placeToVisit.add("New Zealand");
//		placeToVisit.add("Goa");
//		placeToVisit.add("Bangalore");
//		placeToVisit.add("Kerala");
//		placeToVisit.add("Wayanad");
//		placeToVisit.add("London");

		// printList(placeToVisit);

		// placeToVisit.add(0, "United States of America");
		// placeToVisit.remove(2);
//		placeToVisit.isEmpty();
//		printList(placeToVisit);

		addInOrder(placeToVisit, "New York");
		addInOrder(placeToVisit, "USA");
		addInOrder(placeToVisit, "New Zealand");
		addInOrder(placeToVisit, "Goa");
		addInOrder(placeToVisit, "Bangalore");
		addInOrder(placeToVisit, "Kerala");
		addInOrder(placeToVisit, "Wayanad");
		// printList(placeToVisit);
		visit(placeToVisit);

	}

	// Using Iterator
	public static void printList(LinkedList<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			// Collections.sort(list, String.CASE_INSENSITIVE_ORDER); //Ascending Order
			// Collections.sort(list,
			// Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); //Descending order
			System.out.println("Now Listing " + iterator.next());
		}
		System.out.println("**************************");
	}

	// Using List Iterator
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		java.util.ListIterator<String> lIterator = linkedList.listIterator();
		while (lIterator.hasNext()) {
			int comparision = lIterator.next().compareTo(newCity);
			if (comparision == 0) {
				System.out.println(newCity + " is already added");
				return false;
			} else if (comparision > 0) {
				lIterator.previous();
				lIterator.add(newCity);
				return true;
			} else if (comparision < 0) {

			}
		}
		lIterator.add(newCity);
		return true;
	}

	private static void visit(LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> lIterator = cities.listIterator();
		if (cities.getFirst().equals("")) {
			System.out.println("No city in the list");
			return;
		} else {
			System.out.println("Now visiting the cities " + lIterator.next());
			printMenu();
		}
		while (!quit) {
			System.out.println("Enter the Choice :: \n");
			int action = scanner.nextInt();
			switch (action) {
			case 1:
				System.out.println("Holiday (Vacation) over )");
				quit = true;
				break;
			case 2:
				if (!goingForward) {
					if (lIterator.hasNext()) {
						lIterator.next();

					}
					goingForward = true;
				}
				if (lIterator.hasNext()) {
					System.out.println("Now visiting the next cities " + lIterator.next());
				} else {
					System.out.println("Reached the end of the list");
					goingForward = false;
				}
				break;
			case 3:
				if (goingForward) {
					if (lIterator.hasPrevious()) {
						lIterator.previous();

					}
					goingForward = false;
				}
				if (lIterator.hasPrevious()) {
					System.out.println("Now visiting previous cities " + lIterator.previous());
				} else {
					System.out.println("Reached the initial part of the list");
					goingForward = true;
				}

			}

		}
	}

	private static void printMenu() {
		System.out.println("Available actions \n Press ");
		System.out.println("\t 1 - To Quit");
		System.out.println("\t 2 - Go to next city");
		System.out.println("\t 3 - Go to previous city");
	}

}
