package com.practice.abub;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {

	private String bankName;
	ArrayList<Branches> myBranches;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
		this.myBranches = new ArrayList<Branches>();
	}

	public String addBranch(String branchName) {
			
		if (findBranch(branchName) == null) {
			this.myBranches.add(new Branches(branchName));
			return "Added";
		}
		return "Branch Exists "+branchName;
	}

	public boolean addCustomer(String branchName, String customerName, double initAmount) {
		Branches branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, initAmount);
		}
		return false;
	}

	public boolean addCutomerTransaction(String branchName, String customerName, double amount) {
		Branches branch = findBranch(branchName);
		if (branch != null) {
			return branch.addTransaction(customerName, amount);
		}
		return false;
	}

	private Branches findBranch(String branchName) {
		for (int i = 0; i < myBranches.size(); i++) {
			Branches checkedBranch = myBranches.get(i);
			if (checkedBranch.getBranchName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branches branch = findBranch(branchName);
		// showTransactions = true;
		if (branch != null) {
			System.out.println("Customer BranchName is " + branch.getBranchName());
			ArrayList<Customers> branchCustomer = branch.getCustomers();
			Iterator<Customers> iterator = branchCustomer.iterator();
			System.out.println("Sixe "+branchCustomer.size());
			System.out.println("Available customer in this brnach" +iterator.hasNext());
			
			while (iterator.hasNext()) {
				Customers customer = iterator.next();

				System.out.println("Customer Name :: " + customer.getName());
				if (showTransactions) {
					System.out.println("Transaction Details");
					ArrayList<Double> transactions = customer.getTransactions();
					Iterator<Double> iteratorTransact = transactions.iterator();
					while (iteratorTransact.hasNext()) {
						Double d = iteratorTransact.next();
						System.out.println("Amount :: " + d);
					}

				}
			}
		}
		return false;
	}

}
