/**
 * 
 */
package com.corejava.day05.homework;

/**
 * @author   jsd1307 cl
 * @date     Jul 25, 2013 6:42:15 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��    CoreJava
 * @����      com.corejava.day05.homework
 * @�ļ���    RunMatcher.java
 *
 */
public class RunMatcher {
	public static void main(String[] args){
		Player p1=PlayerFactory.getInstance("С�һ�");
		Player p2=PlayerFactory.getInstance("С���");
		Matcher.match(p1,p2);
	}
}
