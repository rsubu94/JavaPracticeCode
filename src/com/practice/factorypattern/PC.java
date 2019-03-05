package com.practice.factorypattern;

public class PC implements Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return "Get RAM method in PC";
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return "Get HDD method in PC";
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return "Get CPU method in PC";
	}

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

}
