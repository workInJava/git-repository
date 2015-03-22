/**
 * 
 */
package com.corejava.day05;

/**
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 10:41:25 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   Rect.java
 *
 */
public class Rect extends Shape {

	private double length;//长
	private double width; //宽
	
	public Rect(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	/* (non-Javadoc)
	 * @see com.corejava.day05.Shape#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.Shape#girth()
	 */
	@Override
	public double girth() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}

}
