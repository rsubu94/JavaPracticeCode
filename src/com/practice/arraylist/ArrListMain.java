package com.practice.arraylist;

import java.util.Scanner;

public class ArrListMain {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mp = new MobilePhone("8903631994");

	public static void main(String[] args) {

		int choice = 0;
		boolean exist = false;
		printInstructions();
		while (!exist) {
			System.out.println("--------Please make the choice------");
			System.out.println("Enter the choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				mp.printContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				findContact();
				break;
			case 6:
				exist = true;
				break;
			}

		}
	}

	private static void addContact() {
		System.out.println("Enter the Contact Name :");
		String cName = scanner.nextLine();
		System.out.println("Enter the Mobile Number : ");
		String mobNo = scanner.nextLine();
		// scanner.nextLine();
		Contacts contact = Contacts.createContact(cName, mobNo);
		if (mp.addNewContact(contact)) {
			System.out.println("New Contact added");
		}

	}

	private static void updateContact() {
		System.out.println("Enter the existing contact name :");
		String oCName = scanner.nextLine();
		Contacts oldContact = mp.queryContact(oCName);
		if (oldContact == null) {

			System.out.println("Can't find the contact");
			return;
		}
		System.out.println("Enter the new contact name : ");
		String nCName = scanner.nextLine();
		System.out.println("Enter the new Mobile Number : ");
		String mobNo = scanner.nextLine();

		Contacts newContact = Contacts.createContact(nCName, mobNo);
		mp.updateContact(oldContact, newContact);
		System.out.println("Contact updated added");

	}

	private static void removeContact() {
		System.out.println("Enter the  contact name to remove :");
		String oCName = scanner.nextLine();

		Contacts oldContact = mp.queryContact(oCName);
		if (oldContact.equals(null)) {

			System.out.println("Can't find the contact");
			return;
		}
		mp.removeContact(oldContact);

	}

	private static void findContact() {
		System.out.println("Enter the  contact name to find :");
		String cName = scanner.nextLine();
		Contacts findContact = mp.queryContact(cName);
		if (findContact.equals(null)) {

			System.out.println("Can't find the contact");
			return;
		}
		System.out.println("Contact Found \n Contact Name : " + findContact.getContactName() + "\n Mobile Number "
				+ findContact.getMobilePhone());

	}

	public static void printInstructions() {
		System.out.println("Press  :");
		System.out.println("\t 0 - To Print the choices");
		System.out.println("\t 1 - To View Contacts");
		System.out.println("\t 2 - To Add New Contacts");
		System.out.println("\t 3 - To Update the existing Contacts");
		System.out.println("\t 4 - To remove the existing Contacts");
		System.out.println("\t 5 - To Find the Contact");
		System.out.println("\t 6 - To Exist");
	}
}
