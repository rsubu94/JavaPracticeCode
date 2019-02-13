package com.practice.abub;

public class Main {
	public static void main(String[] s) {

		Bank bank = new Bank("HDFC");

		System.out.println(bank.addBranch("MRC Nagar0"));
		System.out.println(bank.addBranch("Chennai"));
		System.out.println(bank.addBranch("Chennai"));

		bank.addCustomer("MRC Nagar", "Subramanian R", 1000.0);
		bank.addCustomer("MRC Nagar", "Balaji KR", 3000.0);
		bank.addCustomer("MRC Nagar", "Vignesh RBK", 1500.0);

		bank.addCustomer("Chennai", "Pandi R", 2500.0);
		bank.addCustomer("Chennai", "Udaya", 1400.0);
		bank.addCustomer("Chennai", "Maevee", 8900.0);

		bank.addCutomerTransaction("MRC Nagar", "Subramanian R", 2400.0);
		bank.addCutomerTransaction("MRC Nagar", "Balaji KR", 2200.0);
		bank.addCutomerTransaction("MRC Nagar", "Vignesh RBK", 2600.0);

		bank.listCustomers("MRC Nagar", false);
		
		
	}

}
