/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   �� ��
 * @����ʱ�� Jul 23, 2013 7:04:01 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03.homework
 * @�ļ���   Shape.java
 *
 */
public class Shape {

	//����
	private String shape;
	
	public Shape(String shape){
		this.shape = shape;
	}
	
	
	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	//�����
	public double CalArea(){
		return 0.0;
	}
	
	//���ܳ�
	public double CalGirth(){
		return 0.0;
	}
}
