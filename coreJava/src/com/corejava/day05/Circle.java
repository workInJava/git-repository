/**
 * 
 */
package com.corejava.day05;

/**
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 10:20:02 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   Circle.java
 *
 */
public class Circle extends Shape {

	private double radius;//�뾶
	
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
		System.out.println("Circle �е�a����...");
	}

	@Override
	public String toString() {
		StringBuffer stb = new StringBuffer();
		
		return super.toString();
	}
	
	
}
