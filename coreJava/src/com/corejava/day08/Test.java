package com.corejava.day08;

import com.corejava.day08.OuterTest.MemberNested;

public class Test {

	public static void main(String[] args) {
		OuterTest ot = new OuterTest();
		ot.method1();
		
		//�����ڲ������
		OuterTest.MemberInner om = 
						ot.new MemberInner();
		om.print();
		
		System.out.println("//-----------");
		MemberNested mn = new MemberNested();
		mn.nested();
	}
}

