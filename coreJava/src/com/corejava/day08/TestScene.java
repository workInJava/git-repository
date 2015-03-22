package com.corejava.day08;

public class TestScene {

	public static void main(String[] args) {
		Scene s = new Scene(1990,Season.AUTUMN);
		System.out.println(Season.AUTUMN);
		Season[] season =  Season.values();
		for(Season se : season){
			System.out.println(se);
		}
		//s.start();
	}
}
