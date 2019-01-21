package com.practice.composition;

public class PC {

	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;

	public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}

	public void powerUp() {
		theCase.powerSupply();
		drawLogo();
		motherBoard.loadProgram("TEST");
	}

	public void drawLogo() {
		monitor.drawPixelAt(1234, 584, "Red");
	}


}
