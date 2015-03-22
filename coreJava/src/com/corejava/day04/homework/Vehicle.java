/**
 * 
 */
package com.corejava.day04.homework;

/**
 * @author  ZhaoPan
 * @date 	Jul 24, 2013 6:07:12 PM
 * @version v1.0
 * @project corejava
 * @package com.train.day04.homework
 * @file 	Vehicle.java
 * @since	JDK1.6
 */
public class Vehicle {
	//属性
	private String kind;	//交通工具种类
	
	/**
	 * @param kind
	 */
	public Vehicle(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}

	//方法
	public void run() {
		System.out.println("Vehicle running...");
	}
}
