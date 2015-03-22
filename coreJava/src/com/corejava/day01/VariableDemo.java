/****************
 * 类文件的注释：<br/>
 * <p>一般这里用来描述这个文件的整体概括<p>
 * 
 */

package com.corejava.day01;

/**
 * <p>本类是演示变量的案例</p>
 * @see JVMInfo
 * @author 	jsd1307
 * @创建时间 Jul 19, 2013 4:12:32 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day01
 * @文件名   VariableDemo.java
 *
 */
public class VariableDemo {
	
	/******************
	 * 方法功能的描述
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		//定义变量
		int i = 100;
		long a = i; //隐式转换 
//		char c = i; //报错，会丢失精度
		char c = (char)i; //强制类型转换
		
		//输出
		System.out.printf("i = %d\n",i);
		System.out.printf("a = %d\n",a);
		System.out.printf("c = %s\n",c);

		//unicode 字符表示法
		char c1 = '\u4efb';
		char c2 = '\u5c0f';
		char c3 = '\u6797';
		System.out.println(c1+","+c2+","+c3);
		char c4 = '\u0009'; //相当于 \t
		char c5 = '\u0000';
		System.out.println(c4+","+c5);
	}
}
