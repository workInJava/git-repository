package com.corejava.day03;
/*************
 * 水果类
 * @author 	jsd1307
 * @创建时间 Jul 23, 2013 10:57:26 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03
 * @文件名   Fruits.java
 *
 */
public class Fruits {

	//属性
	private String name; //名称
	private String category; //种类
	private String color; //颜色
	
	
	public Fruits() {
//		super();
		System.out.println("Fruits: 空参构造...");
	}

	public Fruits(String name, String category, String color) {
//		super();
		System.out.println("Fruits: 3参构造...");
		this.name = name;
		this.category = category;
		this.color = color;
	}
	
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	//方法
	/**********
	 * 描述水果信息的方法
	 */
	public void desc(){
		System.out.printf("水果名称：【%s】\n"
				,name == null ? "无名水果" : name);
		System.out.printf("水果种类：【%s】\n"
				,category == null ? "无种类" : category);
		System.out.printf("水果颜色：【%s】\n"
				,color == null ? "无色" : color);
	}
}
