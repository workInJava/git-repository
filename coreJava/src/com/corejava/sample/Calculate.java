package com.corejava.sample;

import java.math.BigInteger;

//���׼�������
public class Calculate {

	public static long add(long a, long b){
		return a + b;
	}
	public static double add(double a, double b){
		return a + b;
	}
	
	public static long substract(long a, long b){
		return a - b;
	}
	public static double substract(double a, double b){
		return a - b;
	}
	public static long multiply(long a, long b){
		return a * b;
	}
	public static double multiply(double a ,double b){
		return a * b;
	}
	public static long divide(long a, long b){
		if(b == 0){
			throw new RuntimeException("��ĸ����Ϊ0");
		}
		return a / b;
	}
	public static double divide(double a , double b){
		return a / b;
	}
	//�����������Ľ׳�
	public static BigInteger factor(int a){
		//
		BigInteger bi = new BigInteger(String.valueOf(a));
		if(a == 1){
			return BigInteger.ONE;
		}
		return bi.multiply(factor(a - 1));
	}
	
	public static String toBinary(int num){
		return Integer.toBinaryString(num);
	}
	
}
