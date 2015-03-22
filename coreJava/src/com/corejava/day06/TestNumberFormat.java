package com.corejava.day06;

import java.text.NumberFormat;

public class TestNumberFormat {

	public static void main(String[] args) {
		double d1 = 3.14159;
		double sal = 3885.79;
		double y = 0.32;
		
		//格式化: 默认的格式器
		NumberFormat nf1 = NumberFormat.getInstance();
		nf1.setMaximumFractionDigits(2);//保留1位小数位
		System.out.printf("%s\n",nf1.format(d1));
		
		NumberFormat nf2 =
			NumberFormat.getCurrencyInstance();
		nf2.setMaximumFractionDigits(1);
		System.out.printf("%s\n",nf2.format(sal));
		
		NumberFormat nf3 = 
			NumberFormat.getPercentInstance();
		nf3.setMaximumFractionDigits(3);
		System.out.printf("%s\n",nf3.format(y));
		
	}
}
