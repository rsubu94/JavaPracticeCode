package com.practice.factorypattern;

public class ComputerFactory {

	public static Computer getInstance(String computerType, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(computerType))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(computerType)) {
			return new Server(ram, hdd, cpu);
		} else if ("".equalsIgnoreCase(computerType))
		{
			System.out.println("return null");
			return null;
		}
			
		return null;
	}

}
