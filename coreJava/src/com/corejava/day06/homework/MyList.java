/**
 * 
 */
package com.corejava.day06.homework;

/**
 * 此接口规范了 容器操作的相关方法
 * @author   周 麒
 * @创建时间 Jul 26, 2013 3:11:37 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day06.homework
 * @文件名   MyList.java
 *
 */
public interface MyList {

	//属性
	int BASIC_SIZE = 4;
	/******************
	 * 添加数据到此“容器”
	 * @param data 容器
	 */
	void add(int data);

	/***
	 * 从容器中移除数据
	 * @param data 数据
	 */ 
	void remove(int data);

	/*** 
	 * 获取此容器中有效元素的个数
	 * @return 有效元素个数
	 */
	int size();

	/*****
	 * 根据下标获取指定的元素
	 * @param index 下标， 
	 * 	如果下标越界，则将抛出下标越界异常
	 * @return 元素
	 */
	int get(int index);

	/*******
	 * 输出容器中所有元素
	 */
	void output();
}
