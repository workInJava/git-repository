/**
 * 
 */
package com.corejava.day04.homework;

/**
 * @author  ZhaoPan
 * @date 	Jul 24, 2013 6:19:56 PM
 * @version v1.0
 * @project corejava
 * @package com.train.day04.homework
 * @file 	Car.java
 * @since	JDK1.6
 */
public class Car extends Vehicle {

	public Car(String kind) {
		super(kind);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("[%s]is running fast!\n", super.getKind());
	}
	

}
