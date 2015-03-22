/**
 * 
 */
package com.corejava.day01;

/**
 * @author Administrator
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello,World!");
		
		ClassLoader cl = HelloWorld.class
							.getClassLoader();
		System.out.println(cl);
	}
}

