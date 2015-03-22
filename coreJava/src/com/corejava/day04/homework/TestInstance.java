package com.corejava.day04.homework;

import com.corejava.day05.homework.TestInner;

public class TestInstance {

	public static void main(String[] args){
		TestSingleton test = TestSingleton.getInstance();
		TestSingleton test1 = TestSingleton.getInstance();
		System.out.println(test==test1);
		
		TestInner testInner = new TestInner();
		
	}
}
