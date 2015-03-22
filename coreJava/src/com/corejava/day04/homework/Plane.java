/**
 * 
 */
package com.corejava.day04.homework;

/**
 * @author  ZhaoPan
 * @date 	Jul 24, 2013 6:18:09 PM
 * @version v1.0
 * @project corejava
 * @package com.train.day04.homework
 * @file 	Plane.java
 * @since	JDK1.6
 */
public class Plane extends Vehicle {

	public Plane(String kind) {
		super(kind);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("[%s]is flying in the sky!\n",
				super.getKind());
	}
	
}
