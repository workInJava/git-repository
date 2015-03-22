/**
 * 
 */
package com.corejava.day05;

/**
 * 火箭类
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 2:17:56 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   Rocket.java
 *
 */
public class Rocket extends Vehicle {

	/* (non-Javadoc)
	 * @see com.corejava.day05.Movable#getSpeed()
	 */
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 7900;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		// TODO Auto-generated method stub
		System.out.printf
		("火箭正在以【%d m/s】的速度向【%s】移动.\n"
				,getSpeed(),convert(direction));
	}

}
