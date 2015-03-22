/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   周 麒
 * @创建时间 Jul 23, 2013 7:22:24 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03.homework
 * @文件名   Square.java
 *
 */
public class Square extends Rect {

	//属性
//	private double length;
	
	//构造方法
	/*public Square() {
		super();
	}*/

	public Square(String shape,double length) {
		super(shape,length,length);
//		this.length = length;
	}

	//set\get
	/*public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}*/
	
}
