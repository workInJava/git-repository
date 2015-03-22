package com.corejava.day04.homework;

public class Train extends Vehicle {

	public Train(String kind){
		super(kind);
	}
	
	@Override
	public void run() {

		System.out.printf
			("[%s] 正在火车轨道上高速前行.\n",getKind());
	}
}
