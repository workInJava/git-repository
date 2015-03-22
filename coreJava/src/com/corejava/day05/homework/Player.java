/**
 * 
 */
package com.corejava.day05.homework;

/**
 * @author   jsd1307 cl
 * @date     Jul 25, 2013 6:40:42 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day05.homework
 * @文件名    Player.java
 *
 */
public interface Player {
	
	String BU = "布";		//布
	String JIANDAO = "剪刀";	//剪刀
	String SHITOU = "石头";	//石头

	String getName(); //得以参与者的姓名
	String show(); //决定出什么手势, 返回本接口的三个常量之一
}
