package com.Design.pattern.factory;

public class FactoryTest {

	public static void main(String args[]){
		
		 SendFactory factory = new SendFactory();
		 ISender s = factory.produce("sms");
		 s.send();
	}
}
