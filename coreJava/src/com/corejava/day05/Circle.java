/**
 * 
 */
package com.corejava.day05;

/**
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 10:20:02 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   Circle.java
 *
 */
public class Circle extends Shape {

	private double radius;//半径
	
	public Circle(String name,double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.Shape#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.Shape#girth()
	 */
	@Override
	public double girth() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	public static void a(){
		System.out.println("Circle 中的a方法...");
	}

	@Override
	public String toString() {
		StringBuffer stb = new StringBuffer();
		
		return super.toString();
	}
	
	
}
