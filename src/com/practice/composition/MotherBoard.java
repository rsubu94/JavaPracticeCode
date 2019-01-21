package com.practice.composition;

public class MotherBoard {

	private String model;
	private String manufacturer;
	private int ramslots;
	private int cardSlots;
	private String bios;

	public MotherBoard(String model, String manufacturer, int ramslots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramslots = ramslots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getRamslots() {
		return ramslots;
	}

	public void setRamslots(int ramslots) {
		this.ramslots = ramslots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}
	
	public void loadProgram(String programName)
	{
		System.out.println("Program " +programName+ " is now loading" );
	}
}
