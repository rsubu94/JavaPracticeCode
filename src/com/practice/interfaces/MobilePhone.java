package com.practice.interfaces;

public class MobilePhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn =false;

	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile Phone powered on");
	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn)
		{
			System.out.println("Now ringing "+phoneNumber+"on mobile phone");

		}
		else {
			System.out.println("Mobile Phone is switched Off");
		}
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answer the mobile phone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber && isOn) {
			isRinging=true;
			System.out.println("Ring Ring");
		}
		else
		{
			System.out.println("mobile phone is off or number not same");
			return false;
			
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return false;
	}

}
