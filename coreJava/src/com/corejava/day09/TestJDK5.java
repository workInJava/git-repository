package com.corejava.day09;

import static java.lang.Math.PI;

public class TestJDK5 {

	public static void main(String[] args) {
		double d = PI * 5;
		System.out.printf("d = %.2f\n",d);
		
		long r = add(1,2,4,5);
		System.out.println(r);
		r = add(1,2,3,4,5,5,6,9,7,78,8);
		System.out.println(r);
	}
	
	//�ɱ䳤����
	public static long add(int... nums){
		long result = 0;
		for(int i : nums){ //������ʹ��
			result += i;
		}
		return result;
	}
}
