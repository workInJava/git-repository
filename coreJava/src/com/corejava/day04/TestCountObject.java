package com.corejava.day04;

public class TestCountObject {

	public static void main(String[] args) {
//		CountObject co = null;
		CountObject[] cos = new CountObject[10];
		for(int i=0;i<cos.length;i++){
			CountObject co = new CountObject("С"+(i+1));
			cos[i] = co;
		}
		cos[2].setName("����С");
		//���
		for(CountObject co : cos){
			System.out.printf
			("[%s]�ǵ�[%d]�������ģ�Ŀǰ���ƣ�[%d]������\n"
				,co.getName(),co.getI(),CountObject.count());
		}
	}
}
