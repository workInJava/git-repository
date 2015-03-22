package com.corejava.day04;

/************
 * 单例模式(Singleton)
	目的：保证某个类的实例在整个软件中只能是唯一的
	场景：在需要保证类的实例是唯一的情形下。
	实现原理：
	1.构造方法私有化。
	2.提供一个静态属性来保存本类的唯一实例。
	3.提供一个公开静态方法，来获取本类的唯一实例
 * @author 	jsd1307
 * @创建时间 Jul 24, 2013 3:56:03 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day04
 * @文件名   Singleton.java
 *
 */
public class Singleton {

	private static Singleton instance 
						= new Singleton();

	// 为了保证不让外界能自由地创建对象，使得
	// 构造方法私有化
	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
