package com.corejava.day07;

import java.io.UnsupportedEncodingException;

/**********
 * �ַ�������
 * @author 	jsd1307
 * @����ʱ�� Jul 29, 2013 2:06:42 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day07
 * @�ļ���   StringDeCode.java
 *
 */
public class StringDeCode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "Hello,�ܿ�";
		System.out.println("�ַ����ĳ��ȣ�"+str.length());
		//������ֽ����飬����Ĭ���ַ���
		byte[] arr = str.getBytes();
		System.out.println("�ֽ�����ĳ��ȣ�"+arr.length);
		
		//���°�arr �������
		String str2 = new String(arr);//Ĭ���ַ���
		System.out.println(str2);
		
		String str3 = new String(arr,"UTF-8");
		System.out.println(str3);
		
	}
}

