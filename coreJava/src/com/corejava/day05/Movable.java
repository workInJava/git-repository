package com.corejava.day05;
/*************
 * 可移动的 接口
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 2:07:45 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   Movable.java
 *
 */
public interface Movable {
	//定义常量属性
	int EAST = 1; //东
	//相当于:public static final int EAST = 1;
	int WEST = 2; //西
	
	int SOUTH = 3; //南
	
	int NORTH = 4; //北
	
	/****************
	 * 移动方法
	 * @param direction 方向, 
	 * 它的值应该是 EAST, WEST,SOUTH,NORTH 四个常量之一
	 */
	void move(int direction);
	//相当于：public abstract void move(int direction);
	/********
	 * 获取移动的速度
	 * @return
	 */
	int getSpeed();
	
}
