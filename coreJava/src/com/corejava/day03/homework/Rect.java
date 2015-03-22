/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   周 麒
 * @创建时间 Jul 23, 2013 7:16:14 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03.homework
 * @文件名   Rect.java
 *
 */
public class Rect extends Shape {

	//属性
	private double length;
	private double width;
	
	//构造函数

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
