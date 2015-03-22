/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   周 麒
 * @创建时间 Jul 23, 2013 7:04:01 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03.homework
 * @文件名   Shape.java
 *
 */
public class Shape {

	//属性
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


	//求面积
	public double CalArea(){
		return 0.0;
	}
	
	//求周长
	public double CalGirth(){
		return 0.0;
	}
}
