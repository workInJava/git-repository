package com.corejava.day03;
/***********
 * ƻ������
 * @author 	jsd1307
 * @����ʱ�� Jul 23, 2013 11:12:18 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03
 * @�ļ���   Apple.java
 *
 */
public class Apple extends Fruits {

	//����
	
	//����
	public Apple(){
//		super();
		System.out.println("Apple: �ղι���");
	}
	
	public Apple(String name,String category,String color){
		//���ø�����Ӧ�Ĺ��췽��
		super(name,category,color);
//		super();
	}
}

