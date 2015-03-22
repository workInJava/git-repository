/**
 * 
 */
package com.corejava.day04.homework;

/**
 * @author  ZhaoPan
 * @date 	Jul 24, 2013 6:09:37 PM
 * @version v1.0
 * @project corejava
 * @package com.train.day04.homework
 * @file 	Bike.java
 * @since	JDK1.6
 */
public class Bike extends Vehicle {
	public Bike(String kind) {
		super(kind);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("[%s]is running .\n", super.getKind());
	}
	
}
