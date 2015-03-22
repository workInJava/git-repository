/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   �� ��
 * @����ʱ�� Jul 23, 2013 7:16:14 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03.homework
 * @�ļ���   Rect.java
 *
 */
public class Rect extends Shape {

	//����
	private double length;
	private double width;
	
	//���캯��

	public Rect(String shape,double length, double width) {
		super(shape);
		this.length = length;
		this.width = width;
	}

	//set\get
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double CalArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
	@Override
	public double CalGirth() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
}
