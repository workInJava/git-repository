/**
 * 
 */
package com.corejava.day05.homework;

/**
 * @author   jsd1307 cl
 * @date     Jul 25, 2013 6:42:15 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day05.homework
 * @文件名    RunMatcher.java
 *
 */
public class RunMatcher {
	public static void main(String[] args){
		Player p1=PlayerFactory.getInstance("小灰灰");
		Player p2=PlayerFactory.getInstance("小红红");
		Matcher.match(p1,p2);
	}
}
