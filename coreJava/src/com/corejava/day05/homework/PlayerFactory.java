/**
 * 
 */
package com.corejava.day05.homework;

/**简单工厂。
 * @author   jsd1307 cl
 * @date     Jul 26, 2013 8:44:15 AM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day05.homework
 * @文件名    PlayerFactory.java
 *
 */
public class PlayerFactory {
	public static Player getInstance(String name){
		
		/*if (name.equals("小灰灰")) {
			return new CalPlayer("小灰灰");
		}else{
			return new CalPlayer("小红红");	
		}*/
		
		return new CalPlayer(name);
	}
}
