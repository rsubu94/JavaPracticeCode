package com.practice.abub;

import java.util.ArrayList;

public class Customers {

	private String name;
	private ArrayList<Double> transactions;

	public Customers(String name, double initialAmount) {
		super();
		this.name = name;
		this.transactions = new ArrayList<Double>();
	}

	public void addTransactions(double amount) {
		transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}
	
	

}
