package com.corejava.day03;
/************
 * 动物类
 * @author 	jsd1307
 * @创建时间 Jul 23, 2013 1:41:24 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03
 * @文件名   Animals.java
 *
 */
public class Animals {

	//属性
	private String name; //名称
	private String category; //种类
	
	//构造方法
	public Animals() {
		super();
	}
	public Animals(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	
	//getter/setter 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	//业务方法
	public void spark(){
		System.out.println("动物叫...");
	}
	
	public void eat(){
		System.out.println("动物吃....");
	}
	
}

