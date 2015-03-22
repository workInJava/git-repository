package com.corejava.day03;

public class TestFruits {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.desc();
		System.out.println("//---------------");
		Apple a2 = new Apple("苹果","木本植物","红色");
		a2.desc();
	}
}
