package com.corejava.day04;

/****************
 * 统计对象的个数及每个对象创建的顺序
 * @author 	jsd1307
 * @创建时间 Jul 24, 2013 11:13:43 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day04
 * @文件名   CountObject.java
 *
 */
public class CountObject {

	//属性
	private String name; //对象名称
	private int i;  //对象创建的顺序
	
	private static int count; //记录对象的创建总数
	
	//构造方法
	public CountObject(String name){
		this.name = name;
		//执行业务
		count ++; //每创建一个对象，count就+1;
		this.i = count; //把i赋值为当前的count，
						//也就是创建的顺序
//		this.i = ++count;
	}
	
	//方法
	public int getI(){
		return this.i;
	}
	//静态方法
	public static int count(){
//		System.out.println(i); 不能直接访问非静态成员
//		System.out.println(getI());同上
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

