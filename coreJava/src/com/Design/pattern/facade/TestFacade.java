package com.Design.pattern.facade;

public class TestFacade {

	public static void main(String[] args){
		Computer c = new Computer();
		c.startUp();
		c.shutDown();
	}
}
