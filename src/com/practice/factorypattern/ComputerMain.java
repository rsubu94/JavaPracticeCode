package com.practice.factorypattern;

public class ComputerMain {
	public static void main(String[] args) {

		Computer factoryCreated = ComputerFactory.getInstance("PC", "8 GB", "1 TB", "1.2GHz");

		System.out.println("RAM PC :" + factoryCreated.getRAM());
		System.out.println("HDD PC :" + factoryCreated.getHDD());
		System.out.println("CPU PC :" + factoryCreated.getCPU());
		System.err.println("To String PC " + factoryCreated);

		Computer factoryCreated1 = ComputerFactory.getInstance("Server", "8 GB", "1 TB", "1.2GHz");

		System.out.println("RAM Server :" + factoryCreated1.getRAM());
		System.out.println("HDD Server :" + factoryCreated1.getHDD());
		System.out.println("CPU Server :" + factoryCreated1.getCPU());
		System.err.println("To String Server " + factoryCreated1);

		Computer faComputer = ComputerFactory.getInstance("", "", "", "");
		//System.out.println(faComputer.getCPU());
	}

}
