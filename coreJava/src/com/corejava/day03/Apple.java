package com.corejava.day03;
/***********
 * 苹果子类
 * @author 	jsd1307
 * @创建时间 Jul 23, 2013 11:12:18 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03
 * @文件名   Apple.java
 *
 */
public class Apple extends Fruits {

	//属性
	
	//方法
	public Apple(){
//		super();
		System.out.println("Apple: 空参构造");
	}
	
	public Apple(String name,String category,String color){
		//调用父类相应的构造方法
		super(name,category,color);
//		super();
	}
}

