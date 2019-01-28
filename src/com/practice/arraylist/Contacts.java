package com.practice.arraylist;

public class Contacts {

	private String contactName;
	private String mobilePhone;

	public Contacts(String contactName, String mobilePhone) {
		super();
		this.contactName = contactName;
		this.mobilePhone = mobilePhone;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public static Contacts createContact(String name, String mobNo) {
		return new Contacts(name, mobNo);
	}

}
