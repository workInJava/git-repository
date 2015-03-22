package com.corejava.day04;

public class TestCountObject {

	public static void main(String[] args) {
//		CountObject co = null;
		CountObject[] cos = new CountObject[10];
		for(int i=0;i<cos.length;i++){
			CountObject co = new CountObject("小"+(i+1));
			cos[i] = co;
		}
		cos[2].setName("王二小");
		//输出
		for(CountObject co : cos){
			System.out.printf
			("[%s]是第[%d]个创建的，目前共计：[%d]个对象\n"
				,co.getName(),co.getI(),CountObject.count());
		}
	}
}
