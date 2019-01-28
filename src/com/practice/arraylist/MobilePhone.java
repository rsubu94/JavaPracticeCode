package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contacts> myContactsArrList;

	public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.myContactsArrList = new ArrayList<Contacts>();
	}

	public void printContacts() {
		int i = 1;
		if (myContactsArrList.size() < 0) {
			System.out.println("No Contacts Added");
		} else {
			Iterator<Contacts> iterator = myContactsArrList.iterator();
			while (iterator.hasNext()) {
				Contacts c = iterator.next();
				System.out.println(i + " Name of the Contact : " + c.getContactName());
				System.out.println("\t Mobilenumber of the Contact : " + c.getMobilePhone());
				i++;
			}
		}

	}

	public boolean addNewContact(Contacts contacts) {
		if (findContact(contacts.getContactName()) >= 0) {
			System.out.println("Contact is already saved");
			return false;
		}
		myContactsArrList.add(contacts);
		return true;

	}

	public boolean removeContact(Contacts contacts) {
		int foundPosition = findContact(contacts);
		if (foundPosition < 0) {
			System.out.println(contacts.getContactName() + " is not found");
			return false;
		}
		this.myContactsArrList.remove(foundPosition);
		System.out.println(contacts.getContactName() + " is successfully removed");
		return true;
	}

	private int findContact(Contacts contact) {
		return this.myContactsArrList.indexOf(contact);
	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.myContactsArrList.size(); i++) {
			Contacts contact = myContactsArrList.get(i);

			if (contact.getContactName().equals(contactName)) {
				return i;
			}

		}
		return -1;

	}

	public String queryContact(Contacts contact) {
		if (findContact(contact) >= 0) {
			return contact.getContactName();
		}
		return null;
	}

	public Contacts queryContact(String contactName) {
		int position = findContact(contactName);
		if (position >= 0) {
			return this.myContactsArrList.get(position);
		}
		return null;
	}

	public boolean updateContact(Contacts oldContact, Contacts newContact) {
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0) {
			System.out.println(oldContact.getContactName() + " is not found");
		} else if (findContact(newContact.getContactName()) != -1) {
			System.out.println("New Contact cant be updated");
			return false;
		}

		this.myContactsArrList.set(foundPosition, newContact);
		System.out.println(oldContact.getContactName() + " is successfully updated to " + newContact.getContactName());
		return true;

	}

}
