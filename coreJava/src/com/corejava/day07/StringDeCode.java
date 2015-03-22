package com.corejava.day07;

import java.io.UnsupportedEncodingException;

/**********
 * 字符串编码
 * @author 	jsd1307
 * @创建时间 Jul 29, 2013 2:06:42 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day07
 * @文件名   StringDeCode.java
 *
 */
public class StringDeCode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "Hello,杰克";
		System.out.println("字符串的长度："+str.length());
		//编码成字节数组，采用默认字符集
		byte[] arr = str.getBytes();
		System.out.println("字节数组的长度："+arr.length);
		
		//重新把arr 解码出来
		String str2 = new String(arr);//默认字符集
		System.out.println(str2);
		
		String str3 = new String(arr,"UTF-8");
		System.out.println(str3);
		
	}
}

