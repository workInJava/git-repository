/****************
 * ���ļ���ע�ͣ�<br/>
 * <p>һ������������������ļ����������<p>
 * 
 */

package com.corejava.day01;

/**
 * <p>��������ʾ�����İ���</p>
 * @see JVMInfo
 * @author 	jsd1307
 * @����ʱ�� Jul 19, 2013 4:12:32 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day01
 * @�ļ���   VariableDemo.java
 *
 */
public class VariableDemo {
	
	/******************
	 * �������ܵ�����
	 * @param args �����в���
	 */
	public static void main(String[] args) {
		//�������
		int i = 100;
		long a = i; //��ʽת�� 
//		char c = i; //�����ᶪʧ����
		char c = (char)i; //ǿ������ת��
		
		//���
		System.out.printf("i = %d\n",i);
		System.out.printf("a = %d\n",a);
		System.out.printf("c = %s\n",c);

		//unicode �ַ���ʾ��
		char c1 = '\u4efb';
		char c2 = '\u5c0f';
		char c3 = '\u6797';
		System.out.println(c1+","+c2+","+c3);
		char c4 = '\u0009'; //�൱�� \t
		char c5 = '\u0000';
		System.out.println(c4+","+c5);
	}
}
