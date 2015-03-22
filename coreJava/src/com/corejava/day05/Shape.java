package com.corejava.day05;
/***************
 * 抽象类 -- 形状类型
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 10:16:26 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   Shape.java
 *
 */
public abstract class Shape {

	//属性
	private String name; //形状名称
	
	//构造方法
	public Shape(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//业务方法
	public abstract double area();
	
	public abstract double girth();
	
	public static void a(){
		System.out.println("Shape中的 a 方法...");
	}
}
