package com.corejava.day06;

import java.math.BigInteger;
import java.util.Scanner;

/*********
 * 递归调用
 * @author 	jsd1307
 * @创建时间 Jul 26, 2013 4:34:14 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day06
 * @文件名   Recursion.java
 *
 */
public class Recursion {

	/**************
	 * 利用递归获取一个整数的阶乘
	 * @param num
	 * @return
	 */
	public long factor(int num){
		//指定退出条件
		if(num == 1){
			return 1L;
		}
		return num * factor(num - 1);
	}
	
	/***********
	 * 任意精度整数的阶乘
	 * 利用大整数对象来完成
	 * @param num
	 * @return
	 */
	public BigInteger bfactor(int num){
		//把参数封装成 大整数
		BigInteger bi = 
			new BigInteger(String.valueOf(num));
		//指定退出条件
		if(num == 1){
			return BigInteger.ONE;
		}
		return bi.multiply(bfactor(num - 1));
	}
	
	public static void main(String[] args) {
		Recursion r = new Recursion();
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入整数>");
		int input = scan.nextInt();
		System.out.printf("%d的阶乘是：%s\n"
				,input,r.bfactor(input));
	}
}
