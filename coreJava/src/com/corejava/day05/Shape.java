package com.corejava.day05;
/***************
 * ������ -- ��״����
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 10:16:26 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   Shape.java
 *
 */
public abstract class Shape {

	//����
	private String name; //��״����
	
	//���췽��
	public Shape(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//ҵ�񷽷�
	public abstract double area();
	
	public abstract double girth();
	
	public static void a(){
		System.out.println("Shape�е� a ����...");
	}
}
