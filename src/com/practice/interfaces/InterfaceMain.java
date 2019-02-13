package com.practice.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		ITelephone pITelephone;
		pITelephone = new DeskPhone(446190427);
		pITelephone.powerOn();
	//	pITelephone.dial(234556);
		pITelephone.callPhone(446190427);
		pITelephone.answer();

		pITelephone = new MobilePhone(894455);
		pITelephone.powerOn();
		pITelephone.callPhone(894455);
		pITelephone.answer();
		
	}

}
