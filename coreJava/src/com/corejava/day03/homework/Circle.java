/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   �� ��
 * @����ʱ�� Jul 23, 2013 7:19:54 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03.homework
 * @�ļ���   Circle.java
 *
 */
public class Circle extends Shape {

	//����
	private double r;

	//���췽��

	public Circle(String shape,double r) {
		super(shape);
		this.r = r;
	}

	//set\get
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	@Override
	public double CalArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
	
	@Override
	public double CalGirth() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}
}
