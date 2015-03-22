package com.corejava.day06;

import java.math.BigInteger;
import java.util.Scanner;

/*********
 * �ݹ����
 * @author 	jsd1307
 * @����ʱ�� Jul 26, 2013 4:34:14 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day06
 * @�ļ���   Recursion.java
 *
 */
public class Recursion {

	/**************
	 * ���õݹ��ȡһ�������Ľ׳�
	 * @param num
	 * @return
	 */
	public long factor(int num){
		//ָ���˳�����
		if(num == 1){
			return 1L;
		}
		return num * factor(num - 1);
	}
	
	/***********
	 * ���⾫�������Ľ׳�
	 * ���ô��������������
	 * @param num
	 * @return
	 */
	public BigInteger bfactor(int num){
		//�Ѳ�����װ�� ������
		BigInteger bi = 
			new BigInteger(String.valueOf(num));
		//ָ���˳�����
		if(num == 1){
			return BigInteger.ONE;
		}
		return bi.multiply(bfactor(num - 1));
	}
	
	public static void main(String[] args) {
		Recursion r = new Recursion();
		Scanner scan = new Scanner(System.in);
		System.out.print("����������>");
		int input = scan.nextInt();
		System.out.printf("%d�Ľ׳��ǣ�%s\n"
				,input,r.bfactor(input));
	}
}
