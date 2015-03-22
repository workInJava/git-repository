/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   周 麒
 * @创建时间 Jul 23, 2013 7:19:54 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03.homework
 * @文件名   Circle.java
 *
 */
public class Circle extends Shape {

	//属性
	private double r;

	//构造方法

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
