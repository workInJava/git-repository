/**
 * 
 */
package com.corejava.day05.homework;

/**�򵥹�����
 * @author   jsd1307 cl
 * @date     Jul 26, 2013 8:44:15 AM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��    CoreJava
 * @����      com.corejava.day05.homework
 * @�ļ���    PlayerFactory.java
 *
 */
public class PlayerFactory {
	public static Player getInstance(String name){
		
		/*if (name.equals("С�һ�")) {
			return new CalPlayer("С�һ�");
		}else{
			return new CalPlayer("С���");	
		}*/
		
		return new CalPlayer(name);
	}
}
