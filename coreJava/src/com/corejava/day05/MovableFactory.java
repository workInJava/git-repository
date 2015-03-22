package com.corejava.day05;
/***********
 * 简单工厂类
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 3:06:41 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   MovableFactory.java
 *
 */
public class MovableFactory {

	/***********
	 * 简单工厂方法
	 * @return
	 */
	public static Movable getInstance(){
//		return new Car();
		return new Rocket();
	}
}
