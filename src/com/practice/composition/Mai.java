package com.practice.composition;

public class Mai {

	public static void main(String s[]) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case thecase = new Case("220", "Dell", "240", dimensions);
		// or
		// Case thecase = new Case("220", "Dell", "240", new Dimensions(6565, 58, 6));
		Monitor monitor = new Monitor("23inch Beast", "Acer", 27, new Resolution(2540, 1400));
		MotherBoard motherBoard = new MotherBoard("B3-200", "Asus", 4, 4, "v2.64");
		PC pc = new PC(thecase, monitor, motherBoard);

		/*
		 * One Way calling the methods from different class =---- Composition
		 * 
		 * pc.getMonitor().drawPixelAt(1520, 587, "green");
		 * pc.getMotherBoard().loadProgram("MS_WORD"); pc.getTheCase().powerSupply();
		 * 
		 */
		pc.powerUp();

	}

}
