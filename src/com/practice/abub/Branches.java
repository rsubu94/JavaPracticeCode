package com.practice.abub;

import java.util.ArrayList;

public class Branches {

	private String branchName;
	private ArrayList<Customers> customers;

	public Branches(String branchName) {
		super();
		this.branchName = branchName;
		this.customers = new ArrayList<Customers>();
	}

	public String getBranchName() {
		return branchName;
	}

	public ArrayList<Customers> getCustomers() {
		return customers;
	}

	public boolean newCustomer(String cName, double intialAmount) {
		if (findCustomer(cName) == null) {
			this.customers.add(new Customers(cName, intialAmount));
			System.out.println("Customer Added");
			return true;
		}
		return false;

	}

	public boolean addTransaction(String cName, double amount) {
		Customers existingCustomer = findCustomer(cName);
		if (existingCustomer != null) {
			existingCustomer.addTransactions(amount);
			return true;
		}
		return false;
	}

	private Customers findCustomer(String cName) {
		for (int i = 0; i < customers.size(); i++) {
			Customers checkedCustomer = this.customers.get(i);
			if (checkedCustomer.getName().equals(cName)) {
				return checkedCustomer;
			}
		}
		return null;
	}

}
