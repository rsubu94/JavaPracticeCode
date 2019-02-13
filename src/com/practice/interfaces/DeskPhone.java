package com.practice.interfaces;

public class DeskPhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	
	

	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken,desk phone doesn't have power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing "+phoneNumber+"on desk phone");
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answer the desk phone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging=true;
			System.out.println("Ring Ring");
		}
		else
		{
			return false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return false;
	}

}
