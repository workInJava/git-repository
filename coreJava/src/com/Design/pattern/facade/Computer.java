package com.Design.pattern.facade;

public class Computer {

	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	
	public Computer(){
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startUp(){
		cpu.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("Computer startUp");
	}
	
	public void shutDown(){
		disk.shutDown();
		memory.shutDown();
		cpu.shutDown();
		System.out.println("Computer shutDown");
	}
	
	
}
