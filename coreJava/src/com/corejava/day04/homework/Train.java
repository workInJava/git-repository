package com.corejava.day04.homework;

public class Train extends Vehicle {

	public Train(String kind){
		super(kind);
	}
	
	@Override
	public void run() {

		System.out.printf
			("[%s] ���ڻ𳵹���ϸ���ǰ��.\n",getKind());
	}
}
