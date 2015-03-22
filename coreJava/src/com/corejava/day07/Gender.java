/**
 * 
 */
package com.corejava.day07;

/**
 * @author 	jsd1307
 * @创建时间 Jul 29, 2013 5:13:07 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day07
 * @文件名   Gender.java
 *
 */
public enum Gender {

	//常量属性
	MALE("男")
	//相当于：public static final Gender MALE = new Gender("男");
	,FEMALE("女");
	
	//构造方法，一定是私有的, 默认构造的可以省略
	private Gender(String value){
		this.value = value;
	}
	//设计普通属性
	private String value;
	
	@Override
	public String toString() {
		return value;
	}
	
}
